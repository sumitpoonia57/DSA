import java.util.*;
public class VerticalOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class pair{
        Node node;
        int hd;
        public pair(Node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }
    // VerticalOrder of tree
    public static ArrayList<Integer> verticalOrder(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        while(!q.isEmpty()){
            pair curr=q.poll();
            if(map.containsKey(curr.hd)){
                map.get(curr.hd).add(curr.node.data);
            }else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(curr.node.data);
                map.put(curr.hd,temp);
            }
            if(curr.node.left!=null){
                q.add(new pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right!=null){
                q.add(new pair(curr.node.right,curr.hd+1));
            }
        }
         ArrayList<Integer> ans= new ArrayList<>();
         for(Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet()){
            ans.addAll(entry.getValue());
         }
         return ans;   
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(verticalOrder(root));
    }
    
}

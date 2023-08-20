package Trees;
import java.util.*;
public class TopView {
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
    public static void topView(Node root){
        // Level order traversal
        Queue<pair> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new pair(root,0));
        int max=0;
        int min=0;
        while(!q.isEmpty()){
            pair curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
            }else{
                 if(!map.containsKey(curr.hd)){
                   map.put(curr.hd,curr.node);
                }
            if(curr.node.left!=null){
                q.add(new pair(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new pair(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
            if(!map.containsKey(curr.hd-1)){
                map.put(curr.hd-1,curr.node.left);

            }
            if(!map.containsKey(curr.hd+1)){
                map.put(curr.hd+1,curr.node.right);

            } 

            }
        }
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data+" ");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        topView(root);
    
    }
    
}

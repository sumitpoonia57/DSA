
import java.util.*;

public class SumNodes {
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
        public static ArrayList<Integer> levelOrder(Node root){
            ArrayList<Integer> list=new ArrayList<>();
            Queue<Node> q=new LinkedList<>();
            if(root==null){
                return list;
                }
            q.add(root);
            while(!q.isEmpty()){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                list.add(q.poll().data);
            }
            return list;

        }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        ArrayList<Integer> ans= levelOrder(root);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        System.out.println(sum);  
    }
    
}

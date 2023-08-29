import java.util.*;
public class MorrisTraversal {
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
    public static ArrayList<Integer> morris(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Node curr=root;
        while(curr!=null){
            if(curr.left==null){
                ans.add(curr.data);
                curr=curr.right;
            }
            else{
                Node prev=curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }else{
                    prev.right=null;
                    ans.add(curr.data);
                    curr=curr.right;
                }
            }
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
        System.out.println(morris(root));  
    }
    
}

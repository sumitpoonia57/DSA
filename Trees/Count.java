package Trees;
import java.util.*;

public class Count {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
    public static int Count(Node root){
        if(root==null){
            return 0;
        }
        int left=Count(root.left);
        int right=Count(root.right);
        int total=left+right+1;
        return total;
    }

    public static void main(String[] args) {
         Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        System.out.println(Count(root));
    }
    
}

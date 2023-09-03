package BST;
import java.util.*;
public class Floor {
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
    public static int Floor(Node root,int key){
        int ans=Integer.MAX_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                root=root.left;
            }else{
                ans=root.data;
                root=root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        System.out.println(Floor(root, 11));
    }
    
}

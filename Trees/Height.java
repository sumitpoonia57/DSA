package Trees;
import java.util.*;

public class Height {
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int maxheight=1+Math.max(leftheight,rightheight);
            return maxheight;
        }
        // Diamter of Tree
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftdiameter=diameter(root.left);
            int lh=height(root.left);
            int rightdiameter=diameter(root.right);
            int rh=height(root.right);
            int selfdiameter=lh+rh+1;
            return Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));
        }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        int ans= height(root);
        int diameter=diameter(root);
        System.out.println(ans);
        System.out.println(diameter);

        
    }
    
}

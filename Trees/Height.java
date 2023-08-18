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
        static class Info{
            int diam;
            int height;
            public Info( int diam, int height){
                this.diam=diam;
                this.height=height;
            }
        }
        public static Info Diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=Diameter(root.left);
            Info rightInfo=Diameter(root.right);
            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.height+rightInfo.height+1);
            int height=Math.max(leftInfo.height,rightInfo.height)+1;
            return new Info(diam,height);



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
        System.out.println(Diameter(root).diam);

        
    }
    
}

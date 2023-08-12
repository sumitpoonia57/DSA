package Trees;
import java.util.*;

public class BinaryTreeB {
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
    public static class BinaryTree{
        static  int indx= -1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx]== -1){
                return null;
            }
            Node newNode=new Node(nodes[indx]);
            //System.out.println(newNode.data); it is very important to check how values are print how this function is working 
            // both condition are important to iterate each value of array
            newNode.left=buildTree(nodes);
             newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

    }
    public static  void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
      Node root=  tree.buildTree(nodes);
      tree.inorder(root);
       

    }
    
}

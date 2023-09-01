// Build a Binary Search Tree
package BST;
import java.util.*;
public class Build {
   static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static boolean Search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
             return Search(root.left, val);
        }
        else{
             return Search(root.right, val);
        }
    }
    public static Node Delete(Node root,int val){
        if(root.data<val){
            root.right=Delete(root.right, val);
        }
        else if(root.data>val){
            root.left=Delete(root.left, val);
        }
        else{
            // Case 1 Leave node
            if(root.left==null && root.right==null){
                return null;
            }
            // Case 2 Only One children
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }else{
                // Case 3 when delete node have two children
                Node IS=InorderSuccessor( root.right);
                root.data=IS.data;
                root.right=Delete(root.right, IS.data);
            }
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println(Search(root, 1));
        Delete(root, 1);
        inorder(root);
    }
    
}

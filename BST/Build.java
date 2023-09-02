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
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        }
         else if(root.data<k1){
            printInRange(root.right, k1, k2);
        }
        else{
            printInRange(root.left, k1, k2);
        }
    }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void leafPaths(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
        leafPaths(root.left, path);
        leafPaths(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right,root, max);
    }
    public static Node mirror(Node root){
        if(root==null){
            return root;
        }
        Node left=mirror(root.left);
        Node right=mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

    public static void main(String[] args) {
        int values[]={8,5,3,6,1,4,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println(Search(root, 1));
       // Delete(root, 1);
       // inorder(root);
        //printInRange(root, 5, 12);
        ArrayList<Integer> path=new ArrayList<>();
        leafPaths(root,path);
       System.out.println(isValidBST(root, null, null));
       mirror(root);
       inorder(root); 
    }
    
}

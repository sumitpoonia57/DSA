import java.util.*;

public class Boundary {
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
    public static boolean isLeaf(Node root){
        return root.left==null&&root.right==null;
    }
    public static void leftBoundary(Node root,ArrayList<Integer> res){
        Node curr=root.left;
        while(curr!=null){
            if(isLeaf(curr)==false){
                res.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
    }
    public static void addleaves(Node root,ArrayList<Integer> res){
          if(isLeaf(root)){
            res.add(root.data);
          }
        if(root.left!=null){
             addleaves(root.left, res);
        } 
        if(root.right!=null){
            addleaves(root.right, res);
        } 
    }
    public static void rightBoundary(Node root,ArrayList<Integer> res){
        Node curr=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null){
            if(isLeaf(root)==false){
                temp.add(curr.data);
            }
            if(curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        for(  int i=temp.size()-1;i>=0;i--){
              res.add(temp.get(i));
        }
    }
    public static ArrayList<Integer> printBoundary(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(isLeaf(root)==false){
            ans.add(root.data);
        }
        leftBoundary(root,ans);
        addleaves(root,ans);
        rightBoundary(root,ans);
        return ans;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }
        
    }
    
}

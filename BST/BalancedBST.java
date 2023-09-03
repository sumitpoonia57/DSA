package BST;
// write a program to create balanced binarry search tree from array

public class BalancedBST {
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
    public static Node balanceBST(int arr[],int si,int end){
        if(si>end){
            return null;
        }
        int mid=(si+end)/2;
        Node root=new Node(arr[mid]);
        root.left=balanceBST(arr, si, mid-1);
        root.right=balanceBST(arr, mid+1, end);
        return root;

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
     System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
       Node root= balanceBST(arr, 0, arr.length-1);
       preorder(root);
        
    }
    
}

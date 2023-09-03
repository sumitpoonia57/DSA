package BST;
// print size of largest bst from bimary tree

public class LargestBST {
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
   public static class Info{
        boolean isBST;
         int size;
        int min;
        int max;
        public Info(boolean isBST,int size,int min,int max){
             this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBST=0;
    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        }
        Info left=largestBST(root.left);
        Info right=largestBST(root.right);
        int size=left.size+right.size+1;
        int min=Math.min(root.data,Math.min(left.min,right.min));
        int max=Math.max(root.data,Math.max(left.max,right.max));
        if(root.data<=left.max || root.data>=right.min){
            return new Info(false,size,min,max);
        }
        if(left.isBST && right.isBST){
            maxBST=Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        largestBST(root);
        System.out.println(maxBST);
        
    }
    
}

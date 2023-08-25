import java.util.*;
public class LCA {
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
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
       boolean left= getpath(root.left, n, path);
         boolean right=getpath(root.right, n, path);
        if(left||right){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i=0;
        for(;i<path1.size()& i<path2.size();i++){
            if(path1.get(i).data!=path2.get(i).data){
                break;
            }
        }
        Node ans=path1.get(i-1);
        return ans;
    }
    public static int lcadist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;

        }
        int left=lcadist(root.left, n);
        int right=lcadist(root.right, n);
        if(left== -1 && right==-1){
            return -1;
        }else if(right==-1){
            return left+1;
        }else{
            return right+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node low=lca(root, n1, n2);
        int dist1=lcadist(low,n1);
        int dist2=lcadist(low,n2);
        return dist1+dist2;

    }
    public static int kAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left= kAncestor(root.left, n, k);
        int right=kAncestor(root.right, n, k);
        if(left== -1 && right==-1){
            return -1;
        }
        int max=Math.max(left,right)+1;
        if(max==k){
            System.out.println(root.data);
        }
        return max;
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int left=transform(root.left);
        int right=transform(root.left);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=newleft+left+newright+right+newright;
        return data;
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
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(minDist(root, 4, 6));
      kAncestor(root, 4, 2);
      transform(root);
      preorder(root);
        
    }
    
}

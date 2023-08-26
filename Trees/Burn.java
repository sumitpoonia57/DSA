import java.util.*;
public class Burn {
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
    static class Depth{
        int d;
        public Depth(int d){
            this.d=d;
        }
    }
    public static int minTime(Node root,int target){
        Depth depth=new Depth(-1);
        burntime(root,target,depth);
        return ans;

    }
    static int ans= -1;
    public static int burntime(Node root,int target,Depth depth){
        if(root==null){
            return 0;
        }
        if(root.data==target){
            depth.d=1;
            return 1;
        }
        Depth ld=new Depth(-1);
        Depth rd=new Depth(-1);
        int lh=burntime(root.left, target, ld);
        int rh=burntime(root.right, target, rd);
        if(ld.d!=-1){

            ans=Math.max(ans,ld.d+1+rh);
            depth.d=ld.d+1;
        }else if(rd.d!=-1){
            ans=Math.max(ans,rd.d+1+rh);
            depth.d=rd.d+1;
        }
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
         Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        System.out.println(minTime(root, 5));
    }
    
}

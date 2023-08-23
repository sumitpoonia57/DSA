
import java.util.*;

public class LeftView {
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
    public static void leftViewutil(Node root,ArrayList<Node> list,int level){
        if(root==null){
            return;
        }
        if ( level >= list.size()) { // it is best way to remove error of out of bound exception
            list.add(root);
        }
        
        leftViewutil(root.left, list, level+1);
        leftViewutil(root.right, list, level+1);

    }
    public static void leftView(Node root){
        ArrayList<Node> list=new ArrayList<>();
         leftViewutil(root,list, 0);
        for(Node curr:list){
            System.out.println(curr.data);
        }


    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        leftView(root);
    }
    
}

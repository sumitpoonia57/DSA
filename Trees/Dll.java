import java.util.*;

public class Dll {
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
    static Node head=null;
    static Node right=null;
    static Node prev=null;
    public static void doublelinkedlist(Node root){
        if(root==null){
            return;
        }
        doublelinkedlist(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=right;
        }
         prev=root;
        doublelinkedlist(root.right);
    }
     public static Node binaryTreeToDoublyLinkList(Node root) {
		prev = null;
	    doublelinkedlist(root);
		return head;
	}
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        Node head=;
    
        
    }
    
}

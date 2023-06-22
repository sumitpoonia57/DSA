package LinkedList;
import java.util.*;

public class linkedList {
    public static class Node{
        int data;
        Node next;
        // Constructor
        // intially when linkedlist is created there is assume that there is only node is present in the linked list so that next is refer to null
        public  Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    // this is define as propery
        public static Node head;
        public static Node tail;
        // in linked list we have to call method by using object like ll so it doesnot matter that your function is static or non static
    public  void addFirst(int data){
            // step1 =create new node
            Node newNode=new Node(data);
            // Base Case
            if(head==null){
                head=tail=newNode;
                return;
            }
            // Step2 newNode.next=head ka address assign karna so that link can created
            newNode.next=head;// it will create link
            // Step3 Now change the head of linkedlist to newNode
            head=newNode;
        }
        public void addLast(int data){
            Node newNode=new Node(data);
            // Base Case
            // linked list is emppty
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print(){ // TimeComplexity is O(n)
            // create tempNode
            Node temp=head;
            // always remeber head of linked list doesnot change only the temp variable can change.
            // Base Case:- when linkedlist is empty
            if(head==null){
                System.out.println("LL is emppty");
            }
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void add(int indx,int data){
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<indx-1){
                temp=temp.next;
                i++;
            } 
            // temp m previous node store ho jayege i=idx-1
            newNode.next=temp.next;
            temp=newNode;

        }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        //ll.print();
        ll.addFirst(1);
        //ll.print();
        ll.addFirst(2);
        //ll.print();
        ll.addLast(3);
        //ll.print();
        ll.addLast(5);
        //ll.print();
        ll.add(3,9);
        ll.print();


        
    }
    
}

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
        public static int size;
        // in linked list we have to call method by using object like ll so it doesnot matter that your function is static or non static
    public  void addFirst(int data){
            // step1 =create new node
            Node newNode=new Node(data);
            size++;
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
            size++;
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
            // special case if we want add at head
            if(indx==0){
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<indx-1){
                temp=temp.next;
                i++;
            } 
            // temp m previous node store ho jayege i=idx-1
            newNode.next=temp.next;
            temp.next=newNode;

        }
        public int removeFirst(){
            // special case:
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
              int val=head.data;
              head=tail=null;
              size=0;
              return val;

            }
            int val=head.data;
           // int val=head.data;
            head=head.next;
            size--;
           // return val;
           return val;
        }
        public int removeLast(){
            // special case
              if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
             else if(size==1){
              int val=head.data;
              head=tail=null;
              size=0;
              return val;

            }
            // prev node i=size-2
            Node prev=head;
            for(int i=0;i<size-2;i++){
              prev=prev.next;
              System.out.println(prev.data);
            }
            int val=tail.data;
            prev.next=null;
            size--;
            return val;
        }
        // iterative search
        public int Search(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                System.out.println(temp.data);
                i++;
            
            }
            return -1;
        }
        // helper function
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int indx=helper(head.next,key);
            if(indx== -1){
                return -1;
            }
            return indx+1;

        }
        // recursive search
        public int recSearch(int key){
            return helper(head, key);

        }
        // reverse linked list
        public  void reverse(){
            Node prev=null;
            Node current=tail=head;
            Node next;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
        }
        // find and remove N node from end in linked list
        public void deleteN(int n){
            int size=0;
            // size of linked list
            Node temp=head;
            while(temp!=null){
                  temp=temp.next;
                  size++;
            }
            // edge case if n is head
            if(n==size){
                head=head.next;
                return;
            }
            int i=1;
            int iP=size-n;
            Node prev=head;
            while(i<iP){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
        }
        // slow-fast approach
        public Node findMid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next; //+1
                fast=fast.next.next; //+2
            }
            return slow;// middle Node
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
       System.out.println(ll.size);
       ll.removeFirst();
       ll.print();
       ll.removeLast();
       ll.print();
       System.out.println(ll.Search(3));
       ll.reverse();
       ll.print();
      ll.deleteN(1);
      ll.print();

       


        
    }
    
}

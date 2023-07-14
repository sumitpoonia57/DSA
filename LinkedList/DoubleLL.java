package LinkedList;

public class DoubleLL {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node( int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        size++;
         // create a new node
         Node newnode=new  Node(data);
        // edge case if ll is empty
        if(head==null && tail==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public void print(){ // TimeComplexity is O(n)
        // create tempNode
        Node temp=head;
        // always remeber head of linked list doesnot change only the temp variable can change.
        // Base Case:- when linkedlist is empty
        if(head==null){
            System.out.println("LL is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
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
        head.prev=null;
        size--;
       // return val;
       return val;
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);
        dll.print();
        dll.removeFirst();
        dll.print();
        System.out.println(size);

    }
    
}

package Practice;
public class LinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // Static property
    public static int size;
    public static Node head;
    public static Node tail;
    // Add first
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        // Base Case
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    // Add Last
      public void addLast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
      }
      // print 
      public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println(" null");
      }
      // Add in the middle
      public void add(int idx,int data){
        Node prev=head;
        int i=0;
        size++;
        while(i<idx-1){
            prev=prev.next;
            i++;
        }
        // previous Node :- prev
        Node newNode =new Node( data);
        newNode.next=prev.next;
         prev.next=newNode;
      }
      // remove first
      public int removeFirst(){
        if(head==null){
           System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        }
        size--;
        int val=head.data;
        head=head.next;
        return val;
      }
      public int removeLast(){
        if(size==0){
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;
        }else if(size==1){
            size=0;
            int val=head.data;
            //tail.next=null;
            head=tail=null;
            return val;
        }
        else{
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=tail.data;
            prev.next=null;
           // tail=prev;
            size--;
            return val;
        }
      }
      // Search linked list
      public int Search(int data){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==data){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
      }
      public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      head=prev;
      }
    public static void main(String args[]){
        LinkedList ll=new LinkedList ();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,5);
        ll.removeLast();
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.Search(5));
    }
    
}

package Queue;
import java.util.*;

public class QueueL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        // add in the queue
        public static class Queue{
            
        public static Node head=null;
        public static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode =new Node(data);
            // if the given element is first element in linked list
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        // Remove from queue;
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=head.data;
            // if the queue contain only single element
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
        // peek element from queue
        public static int peek(){
            return head.data;
        }
       }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

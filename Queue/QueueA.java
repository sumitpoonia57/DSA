package Queue;
import java.util.*;
public  class QueueA {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        public Queue(int n){
            arr=new int[n];
            rear= -1;
            size=n;
        }
        // check if queue is empty or not
        public static boolean isEmpty(){
            return rear== -1;
        }
        // add first
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear+=1;
            arr[rear]=data;
        }
        // remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int remove=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear= rear-1;
            return remove;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
         q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}

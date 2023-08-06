package Queue;
import java.util.*;
// implement queue using 2 stacks

public class QueueS {
    public static class Queue{
         static StackQ<Integer> s1=new StackQ<>();
        static StackQ<Integer> s2=new StackQ<>();
        // check if queue is empty or not
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        // add in queue
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove in queue
        public static int remove(){
            return s1.pop();
        }
        // peek in queue
        public static int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}

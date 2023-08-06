package Queue;
// implement stack using two queues
import java.util.*;

public class StackQ {
    public static class Stack{
        static  Queue<Integer> q1=new LinkedList<>();
        static  Queue<Integer> q2=new LinkedList<>();
        // check is stack is empty or not
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        // push in stack
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        // pop in stack
        public static int pop(){
            int top= -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
               return top;
        }
        // peek in stack
        public static int peek(){
            int top= -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
               return top;
        }
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }

        
    }
    
}

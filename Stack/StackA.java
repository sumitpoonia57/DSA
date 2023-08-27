package Stack;
// Implementation of stack data structure using arraylist
import java.util.ArrayList;

public class StackA {
      static class stack{
         static ArrayList<Integer> list=new ArrayList<>();
        // check if stack is empty or not
         public static boolean isEmpty(){
            return list.size()==0;
        }
        // push operation
        public static void push(int data){
            list.add(data);
        }
        // pop operation
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        return list.remove(list.size()-1);
    }
    // peek operation
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}

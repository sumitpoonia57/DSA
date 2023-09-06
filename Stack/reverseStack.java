package Stack;
import java.util.*;
//Reve
public class reverseStack {
        public static void bottomAtStack(Stack<Integer> stack,int data){
            // base condition
            if(stack.isEmpty()){
                stack.push(data);
                return;
           }
          int top=stack.pop();
          bottomAtStack(stack, data);
            stack.push(top);
        }

    public static void reverse(Stack<Integer> s){
      if(s.isEmpty()){
        return;
      }
        int top=s.pop();
        reverse(s);
        bottomAtStack(s, top);
    }


    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        System.out.println(Arrays.asList(s));
        
    }
}

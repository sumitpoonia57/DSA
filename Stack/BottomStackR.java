package Stack;
// bottom Stack using recursion without using extra space
import java.util.*;
public class BottomStackR {
    public static void bottomAtStack(Stack<Integer> stack,int data){
        // base condition to solve
        if(stack.isEmpty()){
            stack.push(data);
            return;
       }
      int top=stack.pop();
      bottomAtStack(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        // Input
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        bottomAtStack(stack, 4);
        System.out.println(Arrays.asList(stack));
        
    }
    
}

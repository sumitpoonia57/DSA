package Stack;
import java.util.*;
// write a program to push element at bottom of stack

public class BottomStack {
    public static void Bottom(Stack<Integer> stack,Integer data){
        Stack<Integer> temp=new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.peek());
            stack.pop();
        }
        stack.push(data);
        while(!temp.isEmpty()){
            stack.push(temp.peek());
            temp.pop();
        }
        System.out.println(Arrays.asList(stack));
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(Arrays.asList(stack));
        Bottom(stack,4);
        
        
    }
    
}

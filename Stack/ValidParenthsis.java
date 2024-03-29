 package Stack;
 import java.util.*;
 public class ValidParenthsis{
    // valid parenthsis problem
    public static boolean validParenthsis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // Check for Opening Case
            if(ch=='(' || ch=='{'|| ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false; // This is for special case where all are Closing character
                }
                // check pairs
                if((s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') || (s.peek()=='{' && ch=='}' )){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String str="({})[]";
        System.out.println(validParenthsis(str));
    }
}
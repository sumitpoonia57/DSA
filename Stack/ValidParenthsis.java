 package Stack;
 import java.util.*;
 public class ValidParenthsis{
    // valid parenthsis
    public static boolean validParenthsis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // check for opening case
            if(ch=='(' || ch=='{'|| ch=='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false; // this is for special case where all are closing character
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
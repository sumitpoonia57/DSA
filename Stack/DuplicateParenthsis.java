package Stack;
import java.util.*;

public class DuplicateParenthsis {
    public static boolean duplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // opening case
            if(ch=='('|| ch=='a' || ch=='+' ||  ch=='b'){
                s.push(ch);
            }
            // closing case
            else{
                int count=0;
                while(s.peek()==')'){
                    s.pop();
                    count++;
                }
                if(count<1){
                return false;
            }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d))";
        System.out.println(duplicate(str));  
    }
    
}

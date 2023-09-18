package Stack;
// write a prograam to convert Infix to postfix expression
import java.util.*;

public class Infix {
    public static int Prec(char ch){
        if(ch=='^'){
            return 2;
        }
        else if(ch=='/' || ch=='*'){
            return 1;
        }
        else if(ch=='+' || ch=='-'){
            return 0;
        }
        return -1;
    }
    public static String infix(String str){
        Stack<Character> s=new Stack<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans+=ch;
            }
            else if(ch=='('){
                s.push('(');
            }
            else if(ch==')'){
                while(!s.isEmpty() && s.peek()!='('){
                    ans+=s.pop();
                }
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                while(!s.isEmpty() && Prec(s.peek())>=Prec(ch)){
                    ans+=s.pop();               
                 }
               s.push(ch);  
            }
        }
        while(!s.isEmpty()){
                ans+=s.pop();
            }
            return ans;

    }
    public static void main(String[] args) {
        String str="3+2*2";
        System.out.print(infix(str));
        
    }
    
}

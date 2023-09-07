package Stack;
import java.util.*;
// write a Program to Evaluate Postfix 
public class postfix {
    public static int PostFix(String str){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                continue;
            }
            else if(Character.isDigit(c)){
                int n=0;
                while(Character.isDigit(c)){
                    n=(n*10)+ (int)(c-'0');
                    i++;
                    c=str.charAt(i);
                }
                s.push(n);
                i--;  
            }
            else{
                int val1=s.pop();
                int val2=s.pop();
                switch(c){
                     case '+':
                     s.push(val1+val2);
                     break;
                     case '-':
                     s.push(val1-val2);
                          break;
                     case '/':
                     s.push(val2/val1);
                          break;
                     case '*':
                     s.push(val2*val1);
                          break;
                }
            }
        }
          return s.pop();
    }
    public static void main(String[] args) {
        String str="";
        System.out.println(PostFix(str));
    }  
}

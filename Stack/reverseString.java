package Stack;
import java.util.*;
//Reverse
public class reverseString {
    public static String toReverse(String str){
      Stack<Character> s=new Stack<>();
      int i=0;
      while(i<str.length()){
        s.push(str.charAt(i));
        i++;
      }
      StringBuilder sb=new StringBuilder();
      while(!s.empty()){
        sb.append(s.pop());
      }
      return sb.toString();
    }
    public static void main(String[] args) {
        String str="Sumit";
        System.out.print(toReverse(str)); 
    }
    
}

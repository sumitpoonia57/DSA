import java.util.*;
public class Upper {
    // write a program to print first character of every word in sentence into upper case and remaining sentence as it is
    public static String upperString(String str){
        StringBuilder sb=new StringBuilder(" ");
         sb.append(Character.toUpperCase(str.charAt(0)));
         for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                 i++;
                 char ch=Character.toUpperCase(str.charAt(i));
                 sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
         }
        String str1= sb.toString();
        return str1;
         

    }
    public static void main(String[] args) {

        String str="hello i am sumit";
        System.out.print(upperString(str));
        
    }
    
}

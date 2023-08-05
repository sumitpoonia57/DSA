import java.util.*;
public class Compress {
    // write a program to perfrom string Compression
    // aaabbbcc -> a3b3c2
    public static String Compression(String str){
        String newString="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newString+=str.charAt(i);
            if(count>1){
                newString+=count.toString();
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        String str="aaabbbcc";
        System.out.print(Compression(str));
        
    }
    
}

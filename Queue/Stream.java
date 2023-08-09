package Queue;
import java.util.*;
// write a program to find firsst non repeating letter in stream of characters

public class Stream {
    public static void Characters(String str){
        // freq array to store the frequency of each alphabet of string from a-z
        Queue<Character> q=new LinkedList<>();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(q.peek());
            }
        }

    }
    public static void main(String[] args) {
        String str="aabccxb";
        Characters(str);
        
    }
    
}

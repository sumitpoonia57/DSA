package Searching;
import java.util.*;
public class Question {
  public static void reverse(char characters[],int start,int end){
    while(start<end){
        char temp=characters[start];
        characters[start]=characters[end];
        characters[end]=temp;
        start++;
        end--;
    }
   
}
public static String reverseWords(String input){
    char[] characters=input.toCharArray();
    int length=characters.length;
    reverse(characters, 0, length-1);
    int start=0;
    for(int end=0;end<length;end++){
        if(characters[end]==' '){
          reverse(characters, start, end-1);
          start=end+1;
        }
    }
     reverse(characters, start, length-1);
     return new String(characters);
}
public static void ReverseChar( char[] characters){
    int length=characters.length;
    int start=0;
    for(int end=0;end<length;end++){
        if(characters[end]==' '){
            reverse(characters, start, end-1);
             start=end+1;
        }
    }
}
    public static void main(String[] args) {
        String str="Today is Sunday";

        // ouput='yadsun';
        String ouput=reverseWords(str);
        System.out.println(ouput);
    }

    
}

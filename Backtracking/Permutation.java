package Backtracking;
// Write a program to find permutation of string
public class Permutation {
 public static void Permuation(String str,String newString){
    if(str.length()==0){
        System.out.println(newString);
        return;
    }
    for(int i=0;i<str.length();i++){
        char currchar=str.charAt(i);
         String perm=str.substring(0,i)+str.substring(i+1);
         Permuation(perm, newString+currchar);
    }
 }
    public static void main(String[] args) {
        String str="ABC";
        Permuation(str,""); 
    }
    
}

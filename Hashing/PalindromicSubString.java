package Hashing;
// Palindrome Substring Queries GFG problem

public class PalindromicSubString {
    public static boolean palindromeSubstring(String str,int L,int R){
        while(L<=R){
            if(str.charAt(L) !=str.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str="abaaabaaaba";
        int L=5;
        int R=8;
        System.out.print(palindromeSubstring(str, L, R));
        
    }
    
}

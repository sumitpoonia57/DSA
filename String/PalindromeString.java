public class PalindromeString {
    // Palindrome String
    public static void palindrome(String name){
        String palindrome="";
        for(int i=name.length()-1;i>=0;i--){
            char a=name.charAt(i);
            palindrome=palindrome+a;
        }
        System.out.println(name.equals(palindrome));
    }
    public static void main(String[] args) {
        // Input
        String name="racecar";
         palindrome(name); 
        
    }
    
}

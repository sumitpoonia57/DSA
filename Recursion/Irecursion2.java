public class Irecursion2 {
    //  Method 2 to write a program to reverse a string
    public static String Reverse(String str){
        // Base Case
        if(str.length()==1){
            return str;
        }
        char currchar=str.charAt(0);
         String nextString=Reverse(str.substring(1));
         System.out.println(nextString);
        return nextString+currchar;
    }
    public static void main(String[] args) {
        String str="abcd";
        String reverse=Reverse(str);
        System.out.print(reverse);
        
    }
    
}

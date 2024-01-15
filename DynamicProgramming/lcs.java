package DynamicProgramming;
import java.util.*;
public class lcs {
    public static int LCS(String str,String str1,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str.charAt(n-1)==str1.charAt(n-1)){
            return 1+LCS(str, str1, n-1, m-1);
        }else{
            int ans=LCS(str, str1, n-1, m);
            int ans1=LCS(str, str1, m, m-1);
            return Math.max(ans, ans1);
        }
    }
    public static void main(String[] args) {
        String str="abcdge";
        String str1="abedg";
        System.out.println(LCS(str, str1, str.length()-1, str1.length()-1));
        
    }
    
}

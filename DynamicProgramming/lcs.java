package DynamicProgramming;
import java.util.*;
public class lcs {
    // RECURSION
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
    // MEMOMIZATION
    public static int DpLCS(String str,String str1,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!= -1){
            return dp[n][m];
        }
        if(str.charAt(n-1)==str1.charAt(n-1)){
           dp[n][m]=  1+LCS(str, str1, n-1, m-1);
           return dp[n][m];
        }else{
            int ans=LCS(str, str1, n-1, m);
            int ans1=LCS(str, str1, m, m-1);
            dp[n][m]= Math.max(ans, ans1);
            return dp[n][m];
        }
    }
    public static void main(String[] args) {
        String str="abcdge";
        String str1="abedg";
        int dp[][]=new int[str.length()+1][str1.length()+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(DpLCS(str, str1, str.length()-1, str1.length()-1,dp));
        
    }
    
}

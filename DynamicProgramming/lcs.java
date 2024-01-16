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
    // Tabulation
    public static int TabLCS(String str,String str1,int n,int m){
        int dp[][]=new int[n+1][m+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        // Base Case
        for(int i=0;i<n+1;i++){
          dp[i][0]= 0;
        }
        for(int i=0;i<m+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str.charAt(i-1)==str1.charAt(j-1)){
                    dp[i][j]=1+(dp[i-1][j-1]);
                }else{
                    int ans=dp[i][j-1];
                    int ans1=dp[i-1][j];
                    dp[i][j]=Math.max(ans,ans1);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str="abcdge";
        String str1="abedg";
        int dp[][]=new int[str.length()+1][str1.length()+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(DpLCS(str, str1, str.length()-1, str1.length()-1,dp));
        System.out.println(TabLCS(str, str1, str.length(), str1.length()));
        
    }
    
}

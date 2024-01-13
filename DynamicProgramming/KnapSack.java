package DynamicProgramming;
import java.util.*;
public class KnapSack {
    // 0-1 KnapSack
    public static int knapSack(int wt[],int values[],int n,int W){
        if(W==0 || n==0){
            return 0;
        }
        // include
        if(wt[n-1]<=W){
            //Include
            int ans=values[n-1]+knapSack(wt, values, n-1, W-wt[n-1]);
            // Exclude
            int ans1=knapSack(wt, values, n-1, W);
            return Math.max(ans,ans1);
        }else{
           return knapSack(wt, values, n-1, W);
        }
    }
    // Memomization
    public static int dpKnap(int wt[],int val[],int n,int W,int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!= -1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            int ans=val[n-1]+dpKnap(wt, val, n-1, W-wt[n-1], dp);
            int ans1=dpKnap(wt, val, n-1, W, dp);
            dp[n][W]=Math.max(ans,ans1);
            return dp[n][W];
        }else{
        dp[n][W]=dpKnap(wt, val, n-1, W, dp);
          return dp[n][W];
        }
    }
public static void main(String[] args) {
    int values[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int n=values.length;
    int W=7;
    System.out.println(knapSack(wt, values, n, W));
    int dp[][]=new int [values.length+1][W+1];
    for(int arr[]:dp){
        Arrays.fill(arr,-1);
    }
    System.out.println(dpKnap(wt, values, n, W, dp));

}
}

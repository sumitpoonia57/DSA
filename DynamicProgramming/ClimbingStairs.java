package DynamicProgramming;
// write a program too solve climbing stair problem
import java.util.*;
public class ClimbingStairs {
    // Recursive approach
    public static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return ways(n-1)+ways(n-2);

    }
    // Memoization
    public static int waysmemo(int n,int dp[]){
        if(n==0){
           return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
       return  dp[n]=waysmemo(n-1, dp)+waysmemo(n-2, dp);
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(waysmemo(n,dp));
        
    }
    
}

package DynamicProgramming;
import java.util.*;
public class TargetSum {
   public static boolean  ans(int arr[],boolean dp[][], int targetSum,int n){
    // Base Case
    //int n=arr.length;
     for(int i=1;i<n+1;i++){
        dp[i][0]=true;
     }
    // int n=arr.length;
     for(int i=1;i<n+1;i++){
        for(int j=1;j<targetSum+1;j++){
            // valid case
            int v=arr[i-1];
            // include
            if(v<=j && dp[i-1][j-v]==true){
                dp[i][j]=true;
            }
            // exclude
            else if( dp[i-1][j]==true){
                dp[i][j]=true;
            }

        }
     }
     return dp[n][targetSum];
   }
    public static void main(String[] args) {
        int targetSum=10;
        int arr[]={4,2,7,1,3};
        int n=arr.length;
        boolean dp[][]= new boolean[n+1][targetSum+1];
        boolean res=ans(arr, dp, targetSum,n);
        System.out.println(res);
        
    } 
    
}

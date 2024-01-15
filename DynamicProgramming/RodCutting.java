package DynamicProgramming;
import java.util.*;
public class RodCutting {
    public static int rod(int length[],int prices[],int rodlength){
        int n=length.length;
        int dp[][]=new int[n+1][rodlength+1];
        //Base Case 
    // we can use to fill entire dp array with 0; in java it is already fill with 0
    for(int i=1;i<n+1;i++){
        for(int j=1;j<rodlength+1;j++){
            // Case 1 Include where both case of include or exclude is there
            if(length[i-1]<=j){
                dp[i][j]=Math.max(prices[i-1]+dp[i-1][j-length[i-1]],dp[i-1][j]);
            }else{
                // Case II of exclude
                dp[i][j]=dp[i-1][j];
            }
        }
    }
    return dp[n][rodlength];
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int rodlength=8;
        System.out.println(rod(length, prices, rodlength));

    }
    
}

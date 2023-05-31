package Arrays;
import java.util.*;
//   leetCodeQuestion

public class leftRight {
    public  static int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftSum[]=new int[n];
        // leftSumArray
        leftSum[0]=0;
       for(int i=1;i<nums.length;i++){
        
        leftSum[i]=leftSum[i-1]+nums[i-1];
       }
       System.out.print(Arrays.toString(leftSum));
      
        // RightSumArray
        int rightSum[]=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=nums[i+1];
        }
        rightSum[0]=sum;
        for(int i=1;i<nums.length;i++){
         rightSum[i]=rightSum[i-1]-nums[i];
        }
        System.out.print(Arrays.toString(rightSum));
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return arr;
        
        
    }
    public static void main(String[] args) {
        int nums[]={10,4,8,3};
        System.out.print(Arrays.toString(leftRightDifference(nums))); 
    }
    
}

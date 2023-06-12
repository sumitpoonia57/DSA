package Hashing;
import java.util.*;

public class LongestSubSequence {
    // Brute force 

    public static int longestSubSequence(int nums[]){
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
       int nums[]={1, 9, 3,10,4, 20, 2};
       System.out.println(longestSubSequence(nums));
 
    }
    
}

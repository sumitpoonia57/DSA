package Hashing;
import java.util.*;
// write a program to find number of  subarray with equal number of 0's and 1's 

public class LargestArray {
    public static int CountSubArray(int num[]){
        int sum=0;
        int result=0;
        int n=num.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(num[i]==0){
                sum=sum-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                result+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(map);
        return result;
        
    }
    public static void main(String[] args) {
        int num[]={0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0 ,0 ,0 ,0 ,1, 0, 1 ,1, 0, 0, 0, 1, 1, 1 ,1, 0, 0 ,0, 1, 1, 1, 0, 1, 0 ,1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1 ,0 ,1, 0, 0, 1, 0, 1, 0, 0, 0, 0};
       int m= CountSubArray(num);
       System.out.println(m);    
    }
    
}

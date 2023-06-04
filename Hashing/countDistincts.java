package Hashing;
// optimized approach to find number of distinct element present in array of given size of window
import java.util.*;

public class countDistincts {
    public static void CountDistinct(int num[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        // target window from 0 to k
        for(int i=0;i<k;i++){
            map.put(num[i],map.getOrDefault(num[i],0)+1);
        }
        System.out.println(map.size());
        // Now window will move from k to end
        for(int i=k;i<num.length;i++){
            if(map.get(num[i-k])==1){
                map.remove(num[i-k]);
            }
            else{
                map.put(num[i-k],map.get(num[i-k])-1);
            }
            map.put(num[i],map.getOrDefault(num[i],0)+1);
            System.out.println(map.size());  
        }   
    }
    public static void main(String[] args) {
        int num[]={1,2,2,1,3,1,1,3};
        int k=4;
        CountDistinct(num, k);
        
    }
    
}

package Hashing;

import java.util.HashMap;
// GFG Question

public class Solution {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map=new HashMap<>();
        int currsum=0;
        int maxlen=0;
        int len=0;
        int start=0;
        int end= 0;
        for(int i=0;i<N;i++){
            currsum+=A[i];
            if(currsum-K==0){
                maxlen=i+1;
            }
            if(map.containsKey(currsum-K)){
                start=map.get(currsum-K);
                end=i;
                len=end-start;
                if(maxlen<len){
                    maxlen=len;
                }
            }

            
        //System.out.println(maxlen)
            map.put(currsum,i);
        }
        //System.out.print(map);
        System.out.print(map);
        return maxlen;
    }
    public static void main(String[] args) {
        int A[]={-13, 0 ,6 ,15, 16, 2,15 ,-12, 17, -16, 0 ,-3 ,19 ,-3, 2 ,-9 ,-6};
        int N=17;
        int K=15;
        System.out.println(lenOfLongSubarr(A, N, K));

    }
    
}

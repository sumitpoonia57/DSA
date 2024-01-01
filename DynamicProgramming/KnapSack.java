package DynamicProgramming;
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
public static void main(String[] args) {
    int values[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int n=values.length;
    int W=7;
    System.out.println(knapSack(wt, values, n, W));
}
}

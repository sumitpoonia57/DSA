package DynamicProgramming;
//Write a program to caalculate fibonacci series of number using optimized way
public class Fibonacci {
    // Memoization 
    public static int fibo(int n,int arr[]){
        if(n==0 || n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n]=fibo(n-1,arr)+fibo(n-2,arr);
        return arr[n];
    }
    // Tabulation to solve fibonacci series question
    public static int fibotabulation(int n){
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int arr[]=new int[n+1];
    System.out.println(fibotabulation(n));
    }
    
}

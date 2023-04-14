public class Recursion5 {
    // write a program to print stack height=n like 2^5 or 3^4 etc
    public static int Height(int x,int n){
        // Base Condition
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*Height(x, n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int m=5;
        int result=Height(x, m);
        System.out.println(result);
        
    }
    
}

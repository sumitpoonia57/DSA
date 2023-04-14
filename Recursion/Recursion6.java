public class Recursion6 {
    // write a program to print stack height with logn complexity
    public static int Height(int x,int n){
        // Base Condition
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // Main Work
        if(n%2==0){
            return Height(x, n/2)*Height(x, n/2);
        }
        else{
            return x*Height(x,n/2)*Height(x,n/2);
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int result=Height(x, n);
        System.out.println(result);
        
    }
    
}

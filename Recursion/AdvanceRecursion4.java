public class AdvanceRecursion4 {
    // write a program to find number of ways in which you can invite n people to your party in single or pairs
    public static int Party(int n){
        // Base Case
        if(n<=1){
            return 1;
        }
        // Party(n-1) is use to  invite people in single
        // (n-1)*Party(n-2) is use to invite people in pairs
        return Party(n-1)+(n-1)*Party(n-2);
        
    }
    public static void main(String[] args) {
        int n=4;
        int Ways=Party(n);
        System.out.println(Ways);
    }
    
}

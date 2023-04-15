// write program to put 1*m tiles in floor of sizde n*m;
public class AdvanceRecursion3 {
    public static int CountTiles(int n,int m){
        // Base Condition
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // VerticalWays
        int verticalPath=CountTiles(n-m, m);
        // HorizontalWays
        int HorizontalPath=CountTiles(n-1, m);
        return verticalPath+HorizontalPath;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        int path=CountTiles(n, m);
        System.out.println(path);
    
        
    }
}

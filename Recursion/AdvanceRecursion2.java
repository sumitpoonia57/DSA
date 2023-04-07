// write program to calculate the total paths in a maze to move from (0,0) to (n,m)
public class AdvanceRecursion2 {
    public static int Count(int i,int j,int m,int n){
        if(i==n  ||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath=Count(i+1,j,n,m);
        int rightPath=Count(i,j+1,n,m);
        int totalPath=downPath+rightPath;
        return totalPath;
        
    }


    
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int path=Count(0, 0, m, n);
        System.out.println(path);


    }
    

}

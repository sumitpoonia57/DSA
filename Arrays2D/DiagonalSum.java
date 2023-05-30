package Arrays2D;

public class DiagonalSum {
    public static void Diagonal(int matrix[][]){
        int n=matrix.length-1;
        int m=matrix[0].length-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==j || i+j==n){
                    sum=sum+matrix[i][j];
                    
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Diagonal(matrix);
       

    }
    
}

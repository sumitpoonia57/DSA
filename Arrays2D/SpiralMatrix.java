package Arrays2D;

public class SpiralMatrix {
    public static void Spiral( int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol;j<endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for(int i=startRow;i<endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // down
            for(int j=endCol;j>startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow;i>startRow;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        } 

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(matrix);
    }
    
}

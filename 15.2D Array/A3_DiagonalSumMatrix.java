// Diagonal Sum of a Matrix.
// Given a square matrix, calculate the sum of the diagonal elements.
// The diagonal elements are the elements of the matrix which are present on the primary diagonal and secondary diangonal.
public class A3_DiagonalSumMatrix {
    public static int diagonalSum(int[][] matrix) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if (i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(diagonalSum(matrix));    // 68    
        }
    
}

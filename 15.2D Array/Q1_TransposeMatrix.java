public class Q1_TransposeMatrix {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Display original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    } 
}

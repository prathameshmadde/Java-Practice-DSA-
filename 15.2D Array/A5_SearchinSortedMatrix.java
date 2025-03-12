// Search in Sorted Matrix
    
class A5_SearchinSortedMatrix{
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix .length && col >= 0){
            if (matrix[row][col] == key){
                return true;
            }
            else if (matrix[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }

    public static void main (String args[]){
        int matrix [][] ={ {10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}
                };
        System.out.println(staircaseSearch(matrix, 29));
    }
}
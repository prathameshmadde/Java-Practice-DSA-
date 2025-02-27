//Array input and output and Search target in Matrix.
import java.util.Scanner;

public class A1_Practice {

    public static boolean search(int matrix[][],int target){
        for(int i=0; i<matrix.length ;i++){
            for(int j=0; j<matrix[0].length ; j++){
                if(matrix[i][j]==target){
                    System.out.println("Found cell at ( "+ i + "," +j+ ")");
                    return true;
                }
            }
            }
        System.out.println("Cell not found ");
        return false;

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int matrix [][]=new int [3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        int target = 5 ;
        for(int i=0; i<n ;i++){
        for(int j=0; j<m ; j++){
            matrix[i][j]= sc.nextInt();
        }
        }

        for(int i=0; i<n ;i++){
            for(int j=0; j<m ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
            }
          
            search(matrix, 6);
        }
        
}

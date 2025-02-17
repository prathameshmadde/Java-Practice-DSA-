// Dimanod pattern     
//      *
//     ***
//    *****
//   *******
//  *********
//   *******
//    *****
//     ***
//      *

public class P8Dimanod {
    
    public static void dimanond(int n){
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
            System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); k++){
                System.out.print("*");
                }
                System.out.println();
        }
        for (int i=1; i<=n; i++){
            for (int j=0; j<=i; j++){
            System.out.print(" ");
            }
            for (int j=(2*n-i-1); j>i; j--){
                System.out.print("*");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
       int a =5;
       dimanond(a); 
    }
}

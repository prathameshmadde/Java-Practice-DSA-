//Hollow Rohambus.
//     *****
//    *   *
//   *   *
//  *   *
// *****
import java.util.Scanner;

public class P7HollowRohambus {

    public static void roham(int n){
       
        
        for (int i=1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter n = ");
       int n= sc.nextInt();
       roham(n);
       sc.close();
    }
}


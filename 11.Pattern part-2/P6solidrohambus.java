// Solid Rohambus.
//     *****
//    *****
//   *****
//  *****
// *****
import java.util.*;
public class  P6solidrohambus {

    public static void roham(int n){
        for (int i=1; i<=n; i++){
            for (int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int j=n; j>=1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter n = ");
       int n=sc.nextInt();
       roham(n);
    }
}
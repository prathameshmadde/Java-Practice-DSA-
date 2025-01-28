// Check given no is prime or not .
import java.util.Scanner;
public class function6 {
    
    public static boolean isPrime(int n){
        boolean isPrime =true;
        for (int i=2; i<n; i++){
            
            if (n%i==0){
                isPrime=false;
            return isPrime;
            }
        }
        return isPrime ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
}

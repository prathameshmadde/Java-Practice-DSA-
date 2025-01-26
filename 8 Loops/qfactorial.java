import java.util.*;
public class qfactorial {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n = ");
        int n = sc.nextInt();
        int sum=1;
        for(int i=1; i<=n; i++){
            sum=sum*i;
        }
        System.out.println("Factorial of n is = " + n);
        
    }
}

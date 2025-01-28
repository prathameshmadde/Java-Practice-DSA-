//Factorial of n .
import java.util.*;
public class function4 {
    public static int factorial(int x){
        int mul=1;
        while(x>0){  
        mul=mul*x;
        x--;

        }
    return mul;
    }
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter =");
    int n = sc.nextInt();
    int fac = factorial(n);
    System.out.println("Factorial = "+fac);
    sc.close();
}

}

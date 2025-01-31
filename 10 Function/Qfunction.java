//sum of digit .
import java.util.Scanner;
public class Qfunction {
    
    public static void sumofdigit(int a){
        int b=a;
        int sum=0;
        while (a>0){
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
            
        }
        System.out.println("Sum of digit = "+sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a = ");
       int a = sc.nextInt();
       sumofdigit(a); 
    }
}

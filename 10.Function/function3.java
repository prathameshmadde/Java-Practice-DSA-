//Product of a and b.
import java.util.Scanner;

public class function3 {
    
    public static int multiply(int x,int y){
        int product = x*y;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product = multiply(a, b);
        System.out.println("Product is = "+product);
        sc.close();
    }
}

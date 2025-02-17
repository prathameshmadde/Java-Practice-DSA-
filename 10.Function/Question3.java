//print even no. without using modulus and multiplication.
import java.util.*;
public class Question3 {
    public static void even(int n){
        for (int i=2 ; i<=n;i=i+2){
            int sum=i;
            //int sum=2*i;
            System.out.println("no="+sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        even(n);
        sc.close();
    }
}

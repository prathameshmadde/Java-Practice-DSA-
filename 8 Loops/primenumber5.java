//check no is prime or not . 
import java.util.*;
public class primenumber5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n =");
        int n = sc.nextInt();
        int answ=0;
        for (int i=2; i<n;i++){

            if (n%i==0){
                answ=1;
            }
           
            }
            if (answ==1){
                System.out.println("Not Prime .");
            }
            else{
                System.out.println("Prime No.");
            }
        }
    }

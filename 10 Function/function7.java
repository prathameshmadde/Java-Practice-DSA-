//Prime no. between Range 2  to n .
import java.util.*;
public class function7 {

public static boolean isPrime (int x){
    boolean isPrime=true;
    for(int i=2; i<x; i++){
        if (x%i==0){
           isPrime=false;
        }
    }
    return isPrime;
}

public static void rangePrime(int n){
    System.out.print("Prime no = ");
    for(int i=2; i<=n; i++){
       
        if(isPrime(i)==true){
            System.out.println(i);
        }

    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n = ");
    rangePrime(7);
    sc.close(); 
}

}
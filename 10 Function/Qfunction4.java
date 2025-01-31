//Check input no.is palindeome or not 
import java.util.*;
public class Qfunction4 {
    
    public static void ispalindrome(int a){
        int dig=0;
        int b=a;
        while (a>0){
        int rem=a%10;
        dig=dig*10+rem;
        a=a/10;
    }
    if (dig==b){
        System.out.println(b +" is Palindrome");
    }
    else{
        System.out.println(b +" is not Palindrome");
    }
}
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a = ");
    int a = sc.nextInt();
    ispalindrome(a);
    sc.close();
}
}

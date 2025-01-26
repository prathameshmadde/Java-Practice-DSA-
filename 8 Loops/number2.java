//Print no. form 1 to n uisng while loop 
import java.util.*;
public class number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n = ");
        int n = sc.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
}

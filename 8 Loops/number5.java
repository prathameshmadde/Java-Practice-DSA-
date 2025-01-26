//Print input no except multiple of 10.
import java.util.*;
public class number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter = ");
            int n =sc.nextInt(); 
            if (n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}

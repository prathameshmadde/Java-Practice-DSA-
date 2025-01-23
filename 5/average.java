// input 3 numbers: A, B andC. Youhave to output the average of these 3 numbers.
import java.util.*;

public class average {

    public static void  main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();
        System.out.println("Enter a = ");
        int b = sc.nextInt();
        System.out.println("Enter a = ");
        int c = sc.nextInt();

        int average = a*b*c;
        System.out.println(average);
    }
}

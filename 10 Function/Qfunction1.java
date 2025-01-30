//Average of 3 no.using function.
import java.util.*;
public class Qfunction1 {
    public static void average (int a, int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("Average = "+ avg);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter =");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b, c);
    }
}

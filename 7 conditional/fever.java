import java.util.*;

public class fever {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature = ");
        double temp =sc.nextDouble();
        if (temp > 100){
            System.out.println("You have Fever.");
        }
        else {
            System.out.println("You dont have Fever.");
        }
    sc.close();
    }
}
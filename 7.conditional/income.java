//claculate income tax.
import java.util.*;

public class income {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your income = ");
        int income=sc.nextInt();
        double tax1 =0;
        if(income<500000){
            System.out.println("No income Tax");
        }
        else if (income>= 500000 && income<= 1000000 ){
            tax1 = income +income*(0.20);
            
        }
        else {
            tax1 = income +income*(0.30);
            
        }
    System.out.println("Income tax  = "+ tax1);
        sc.close();
   }
}

// Write a program that reads a set of integers,andthenprintsthe sum of the even and odd integers
import java.util.Scanner;
public class question2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number ;
            int choice;
            int evenSum =0 ;
            int oddSum =0 ;

            do{
                System.out.println("Enter number =");
                number =sc.nextInt();
                if (number%2==0){
                    evenSum+=number;
                }
                else{
                    oddSum+=number;
                }

                System.out.print("Do you want to continue then press 1 and 0 for NO ");
                choice=sc.nextInt();

            }while(choice==1);

            System.out.println("Sum of even numbers = "+evenSum);
            System.out.print("Sum of odd numbers = "+oddSum);

            sc.close();
            
        }
}

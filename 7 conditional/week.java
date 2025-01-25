import java.util.*;

public class week {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the no. of week day = ");
        int num = sc.nextInt();
        String a="pra" ;
        switch(num){

            case 1 : a = "Monday";
            break;
            
            case 2 : a = "Tuesday";
            break;

            case 3 : a = "Wednsday";
            break;
            
            case 4 : a = "Thursday";
            break;
            
            case 5 : a = "Friday";
            break;
            
            case 6 : a = "Saturday";
            break;

            case 7 : a = "Sunday";
            break;}

            System.out.println(a);

    }    
}

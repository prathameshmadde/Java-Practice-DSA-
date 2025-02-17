import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter Sign Operato = ");
        char sign = sc.next().charAt(0);
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        int ans=0;
        switch(sign){
            case '+' :ans= a+b;
                      break;
            case '-': ans= a-b;
            break; 
            case '*': ans= a*b;
            break;
            case '%': ans= a%b;
            break; 
            case '/': ans= a/b;

        }
        System.out.println(ans);

  sc.close();
    }
}

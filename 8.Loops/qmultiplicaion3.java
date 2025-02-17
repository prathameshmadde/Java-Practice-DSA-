//multiplcation table.
import java.util.*;

public class qmultiplicaion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer n = ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int sum = i * n;
            System.out.println(sum);
        }
        sc.close();
    }
}
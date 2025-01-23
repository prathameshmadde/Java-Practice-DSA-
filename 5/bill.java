// total cost of the items.
import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of Pen = ");
        float pen = sc.nextFloat();
        
        System.out.println("Enter cost of Pencil = ");
        float pencil = sc.nextFloat();
 
        System.out.println("Enter cost of Eraser = ");
        float eraser = sc.nextFloat();
        
        float sum = pen + pencil + eraser ;
        float total = sum + sum*0.18f ;
        System.out.println("total sum without gst = "+sum);
        System.out.println("total Price including gst 18 %  = "+total);
    }    
 }
// output
// Enter cost of Pen = 
// 20
// Enter cost of Pencil =
// 10
// Enter cost of Eraser =
// 5
// total sum without gst = 35.0
// total Price including gst 18 %  = 41.3
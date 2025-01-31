// * * * * *
// *       *
// *       *
// * * * * *
//import java.util.*;

import java.util.Scanner;

public class P1Hollow {
    public static void pattern(int x,int y){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if (i==1 || i== x|| j==1 || j==y){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x (no. of row )= ");
        int x=sc.nextInt();
        System.out.println("Enter y (no.of column )= ");
        int y=sc.nextInt();
        pattern(x, y);
        
    }
    
}

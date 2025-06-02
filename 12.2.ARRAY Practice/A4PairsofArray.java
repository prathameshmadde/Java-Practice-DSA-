// Pairs in array.
// 1 , 2
// 1 , 3
// 1 , 4
// 1 , 5

// 2 , 3
// 2 , 4
// 2 , 5

// 3 , 4
// 3 , 5

// 4 , 5

import javax.swing.event.SwingPropertyChangeSupport;

public class A4PairsofArray {
    
    public static void main(String[]  args){
 int a =0;
        int array1[]={1,2,3,4,5};
        for(int i=0; i<array1.length; i++){
        for(int j=i+1; j<array1.length; j++){
            System.out.println(array1[i] +" , "+ array1[j]);
             
            a++;
        }
        System.out.println();
        } 
        System.out.println("Total no of Pairs in array = "+ a);
     }
     
}
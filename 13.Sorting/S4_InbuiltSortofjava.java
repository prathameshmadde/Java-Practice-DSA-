//Inbuilt function Arrays of java for sorting .
import java.util.Arrays;

public class S4_InbuiltSortofjava {

        public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int arr2[]={6,4,10,35,25}; 
        Arrays.sort(arr);
        print(arr);
        System.out.println();
        System.out.println("sorted only first three elements of array");
        Arrays.sort(arr2,0,2);
        print(arr2);
     }
}

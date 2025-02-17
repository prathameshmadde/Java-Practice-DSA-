//Bubble sort. 
public class S1_BubbleSort {

    public static void bubblesort(int arr[]){

        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length-1-i; j++) {
              
            if(arr[j]>arr[j+1]){
             int s =arr[j]; 
             arr[j]=arr[j+1];
             arr[j+1]= s;
            
            }
           }
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);  
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
    bubblesort(arr);
    
    }
}

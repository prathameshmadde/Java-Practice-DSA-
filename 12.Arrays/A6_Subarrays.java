//total subarrays.
public class A6_Subarrays{
    
    public static void subarrays(int arr[]){
        int ts=0;
        for (int  i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] +" ");
                
                }
                ts++;
                System.out.println();
            }
            System.out.println(); 
        }
        System.out.println("total subarrays = "+ ts);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        subarrays(arr);
        
    }
}


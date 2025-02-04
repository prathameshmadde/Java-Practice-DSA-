//Maximum subarray sum .
public class A8_MaxSubarraySum{
    
    public static void maxsubarraySum(int arr[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE; 

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currentsum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currentsum=currentsum+arr[k];
                }
                System.out.println();
                if (currentsum>maxsum){
                    maxsum=currentsum;
                }
                System.out.println("currentsum = "+currentsum);
            }
            System.out.println();

        }
        System.out.print("Maximum subarray sum ="+maxsum);

    }
    
    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsubarraySum(arr);

    }
}
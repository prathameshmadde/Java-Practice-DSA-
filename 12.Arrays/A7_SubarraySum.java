//maximum sub array sum .
public class A7_SubarraySum{
    public static void subarraysum(int arr[]){
        
        int arr2[]=new int [40];
        int largest=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                sum+=arr[k];
            }
            if(largest<sum){
            largest = sum;
            }  
        } 
    }
        System.out.println("Largest sum of subarray = "+ largest);
    }

    public static void main(String[] args) {
        
        int arr[]={1,-2,6,-1,3};
        subarraysum(arr);


    }

}
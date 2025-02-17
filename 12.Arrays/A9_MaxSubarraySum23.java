//Maximum subarray sum .
public class A9_MaxSubarraySum23{
   
    public static void maxsubarraySum(int arr[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE; 
        int prefix []=new int [arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[(i-1)] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                
                currentsum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                if (currentsum>maxsum){
                    maxsum=currentsum;
                } 
            }
        }
        System.out.print("Maximum subarray sum ="+maxsum);
    
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxsubarraySum(arr);

    }
}
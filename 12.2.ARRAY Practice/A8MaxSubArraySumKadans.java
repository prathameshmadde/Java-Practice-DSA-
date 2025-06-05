//Maximum subarray sum uing Kadan's Algorithum.
public class A8MaxSubArraySumKadans{
    
    public static void subarray(int arr[]){
        int cs = 0;
        int maxsum = Integer.MIN_VALUE; 
        for(int i=0; i<arr.length ; i++){
            cs = cs + arr[i];
            
             if (cs<0){
            cs=0;
        }
        
        maxsum = Math.max(cs,maxsum);
        }
        System.out.println("Maximum sum of sub array = " + maxsum);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        subarray(arr);
    }
}
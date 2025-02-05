//Maximum subarray sum using kadans algo .
public class A10_KadansAlgoratham{

    public static void kadans(int arr[]){
    int ms=Integer.MIN_VALUE;
    int cs= 0;
        for (int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            //maimum function.
            ms=Math.max(ms,cs);
        }
        System.out.println("Our maximum subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(arr);
    }
}
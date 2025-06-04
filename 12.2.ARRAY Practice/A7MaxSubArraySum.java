//Maximum subarray sum using prefix 
public class A7MaxSubArraySum {
    public static void subarraysum(int arr[]){
        int max=0;
        int currsum=0;
        int prefix[]=new int[10];
        prefix[0]=arr[0];
        for(int i =1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i =0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j; 

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currsum>max){
                    max=currsum;
                }
            }
        }
        System.out.println("Maximum sum = "+ max);

    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subarraysum(arr);
    }


}

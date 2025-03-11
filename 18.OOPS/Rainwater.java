public class Rainwater {
    public static int Watertrapped(int arr[]){
        int rightmax [] = new int[arr.length];
        int leftmax [] = new int [arr.length];
        int max = 0;
        for (int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            leftmax[i] = max;
        }
        int min=0;
        for (int i=arr.length-1; i>=0; i--){
            min = Math.max(min, arr[i]);
            rightmax[i] = min;
        }
        int maxwater = 0;
        for (int i=0; i<arr.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]) - arr[i];
             
            maxwater += waterlevel;
        }
        return maxwater;
    }

    public static void main(String[] args) {
        int [] arr = {4, 2, 0, 6, 3, 2,5};
        System.out.println(Watertrapped(arr));
    }
}

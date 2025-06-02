//binary search in a sorted array

public class A2BinarSearch {
    public static int BinarySearch(int array1[],int target){
        int start = 0; 
        int end = array1.length-1;
        
        while(start <= end ){
            int mid = (start + end )/2;
            if (array1[mid ]==target){
                return mid;
            }
            else if ( array1[mid] <target){
                end = mid -1;
            }
            else if ( array1[mid] >target){
                start = mid +1;
            }
            else{
                return -1;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
    int array1[] = {1,2,3,4,5,6,7,8,9,0};
    int target = 5;
    int index= BinarySearch(array1,target);
    if (index != -1){
       System.out.println("Element found at index = "+index);
    }
    else{
        System.out.println("Element not found .");
    }
    }
}

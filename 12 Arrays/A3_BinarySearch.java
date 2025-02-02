//BInary search .

public class A3_BinarySearch {

    public static int  midvalue(int start,int end){
        return (start + end)/2 ;
    }

    public static int  binerysearch(int numbers [],int key){
        int start = 0;
        int end = 6;
        int mid = midvalue(start, end);
        
        while (start < end ){
        if(numbers[mid]>key){
           end = mid - 1;
           mid = midvalue(start,end);
        }
        else if (numbers[mid] <key){
           start = mid + 1;
           mid = midvalue(start,end);

        }
        else{
             return mid;
        }
        } 
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 100;
        System.out.println("Value found at = "+ binerysearch(numbers, key));
    }
}

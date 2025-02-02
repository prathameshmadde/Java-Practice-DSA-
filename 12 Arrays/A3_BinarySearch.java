//BInary search .

public class A3_BinarySearch {

    public static int  midvalue(int start,int end){
        return (start + end)/2 ;
    }

    public static void binerysearch(int numbers [],int key){
        int start = 0;
        int end = 6;
        int mid = midvalue(start, end);
        int x= 1;
        while (x!=0 ){
        if(numbers[mid]>key){
           end = mid - 1;
           mid = midvalue(start,end);
        }
        else if (numbers[mid] <key){
           start = mid + 1;
           mid = midvalue(start,end);
        }
        else{
            System.err.println("value at position " + mid);
            x=0;
        }
        } 
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 10;
        binerysearch(numbers, key);
    }
}

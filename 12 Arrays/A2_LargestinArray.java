//Linear Search.
public class A2_LargestinArray {

    public static void largestvalue(int[] rollno,int largest,int smallest){
            for(int i= 0; i< rollno.length; i++){
                if (rollno[i] > largest){
                   largest = rollno[i];
                }
                if (rollno[i] < smallest){
                    smallest = rollno[i];
                }
        }       
        System.out.println("Largest vlaue = "+largest);
        System.out.println("Smallest vlaue = "+smallest);
    }
    public static void main(String[] args) {
        int rollno[]={1,5,3,8,2,9,7};
        int smallest= Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        largestvalue(rollno,largest,smallest);  
    }
}

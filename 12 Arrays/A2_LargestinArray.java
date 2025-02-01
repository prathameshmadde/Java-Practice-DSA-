//Linear Search.
public class A2_LargestinArray {

    public static int largestvalue(int[] rollno,int largest){
            for(int i= 0; i< rollno.length; i++){
                if (rollno[i] > largest){
                largest = rollno[i];
                }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int rollno[]={1,5,3,8,2,9,7};

        int largest = Integer.MIN_VALUE;
        int answer =largestvalue(rollno,largest);
        System.out.println("Largest no = "+answer);
    }
}

// Write a Java program to check if an integer array contains duplicates. Return  false for duplicates and true otherwise.
public class QA1_EXERCISE{

    public static boolean check(int nums[]){
        boolean b = true;
        for (int i=0; i<nums.length-1;i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    b=false;
                    return b;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(check(nums));
    }

}
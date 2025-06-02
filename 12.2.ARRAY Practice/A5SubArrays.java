//Print subarrays 
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 2
// 2 3
// 2 3 4
// 3
// 3 4
// 4
public class A5SubArrays {
    
    public static void subarray(int array1[]){
        for(int i=0; i<array1.length; i++){
            for(int j=i+1; j<array1.length; j++){
                for(int k=i; k<j; k++){
                    System.out.print(array1[k]+" ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        subarray(array1);
    }
}

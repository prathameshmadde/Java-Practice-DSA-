public class A6SubArrays {
    
    public static void subarray(int array1[]){
        int max = 0;
        for(int i=0; i<array1.length; i++){
            
            for(int j=i; j<array1.length; j++){
                int newsum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(array1[k]+" ");
                    newsum=newsum+array1[k];
                    
                    if (max<newsum){
                    max=newsum;
                    }
                }
                System.out.println();
                
            
            }
        
        }
        System.out.println("Maximum subarray sum = " + max );
    }


    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        subarray(array1);
    }
}

//Reverse Arrya.
public class A3ReverseArray{

    public static void Swaparray(int array1[]){
        int start = 0;
        int last = array1.length -1;

        while(start<last){
            int temp = start ;
            start = last ;
            last = temp ;
            start ++;
            last--;
        }
    }
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5};
        Swaparray(array1);
        for(int i= 0; i<=array1.length; i++){
            
        System.out.print(array1[i]+ " ");
        }
    }

}
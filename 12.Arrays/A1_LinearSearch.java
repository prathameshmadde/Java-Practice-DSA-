//Linear Search.

public class A1_LinearSearch{
    public static int linearsearch (int numbers[],int key){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers [] ={1,2,3,4,5,6,7,8,9,10};
        int key = 8 ;
        int index =linearsearch(numbers, key);

        if (index==-1){
            System.out.println("Not Found .");
        }
        else{
            System.out.println("Value Found at " + index );
        }

    }
}
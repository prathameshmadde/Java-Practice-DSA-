//Print the possible pirs of array elements.
// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10)
// (6,8) (6,10)
// (8,10)
public class A5_Pairs {
    
    public static void possiblepairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
           for (int j=i+1; j<numbers.length;j++){
            System.out.print("("+ numbers[i]+","+numbers[j]+") ");
           }
           System.out.println();
        }
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        possiblepairs(numbers);
    }
}

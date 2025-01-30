// Decimal no. to Binary no.
public class function9 {
    
    public static void dectobinary(int n){
        int bi =0;

        int pow=0;
        while (n>0){
        int r = n%2;
        bi=bi+ (r* (int) Math.pow(10,pow));
        n=n/2;
        pow++;  
        }
        System.out.println(n +"Decimal "+"Binary no.="+bi);
    }
    public static void main(String[] args) {
        
        dectobinary(5);
        
    } 

}

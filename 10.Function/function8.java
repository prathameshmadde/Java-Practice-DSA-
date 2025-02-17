//Convert Binary no. to Decimal no.
public class function8 {
    
    public static void binarytodecimal(int binNum){
        int pow=0;
        int lastdigit;
        int decimal=0;
        int mynum=binNum;

        while(binNum>0){
          lastdigit=binNum%10;
          decimal= decimal+ lastdigit * (int)Math.pow(2,pow);
          pow++; 
          binNum = binNum / 10;
        }
        System.out.println("decimal of "+ mynum +" = "+decimal);
    }

    public static void main(String[] args) {
        binarytodecimal(1101);
    }

}




public class P5Butterfly {
    public static void main(String[] args) {
        
        for(int i=1; i<=4 ; i++){

            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            for(int k=8; k>2*i ; k--){
            System.out.print(" ");    
            }
            for(int l=1; l<=i; l++){
            System.out.print("*");
            }
            System.out.println();

        }

        for(int i=4; i>=1 ; i--){

            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            for(int k=8; k>2*i ; k--){
            System.out.print(" ");    
            }
            for(int l=1; l<=i; l++){
            System.out.print("*");
            }
            System.out.println();

        }
    }
}

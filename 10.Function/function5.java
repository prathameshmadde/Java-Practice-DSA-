//Binomial coefficient .n C r 
public class function5 {
    
    public static int factorial(int n){
        int mul=1;
        for(int i=1; i<=n; i++){
            mul= mul*i;
        }
        return mul;
    }

    public static int bincoefficient(int n,int r){
        int n1 = factorial(n);
        int r1 = factorial(r);
        int r2 = factorial(n-r);
        int ans = n1/(r1*r2);
    return ans;
    }
    
    public static void main(String[] args) {
        int a = bincoefficient(5, 2);
        System.out.println("answer="+a);
    }
}
 
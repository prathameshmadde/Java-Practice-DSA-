//Check String Palindrome or not .
public class S1_Palindrome {
        
    public static boolean isalindrome(String str) {
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
           if (str.charAt(i) != str.charAt(n-i-1)){
               //Not a palindrome 
               return false;
           }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isalindrome(str));
    }
}

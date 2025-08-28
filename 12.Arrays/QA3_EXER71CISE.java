// Question 3: You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Return the maximum profit you can achieve from this transaction. If you cannot
// achieve any profit, return 0. profit

// Example 1:
// Input: prices = [7, 1, 5, 3, 6, 4]
// ARRIVED
// Output: 5
// Explanation:
// Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class QA3_EXER71CISE {

    public static int maxprofit(int array[]){
        int min = Integer.MAX_VALUE;
        int index=0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length-1; i++){
            if (min>array[i]){
                min=array[i];
                index=i;
            }
        }
        for(int i=index+1; i<array.length; i++){
            if (max<array[i]){
                max=array[i];
        
            }
        }
        int profit=max-min;
        if (profit <= 0){
            return 0;
        }
        else{
            return profit;
        }
    }
    
    public static void main(String[] args) {
        
        int array[]= {7,1,5,3,6,4};//return profit 5
        // int array[]= {70,10,5,3,2,1};//return 0
        
        System.out.println(maxprofit(array));

    }
    
}

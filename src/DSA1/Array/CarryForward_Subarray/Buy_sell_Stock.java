package DSA1.Array.CarryForward_Subarray;
//Problem Description
//
//Say you have an array, A, for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//Return the maximum possible profit.
//
//
//
//        Problem Constraints
//
//0 <= A.size() <= 700000
//
//
//
//        1 <= A[i] <= 107
//
//
//
//
//
//Input Format
//
//The first and the only argument is an array of integers, A.
//
//
//        Output Format
//
//Return an integer, representing the maximum possible profit.
//
//
//        Example Input
//
//Input 1:
//A = [1, 2]
//Input 2:
//
//A = [1, 4, 5, 2, 4]
//
//
//Example Output
//
//Output 1:
//        1
//Output 2:
//
//        4
//
//
//Example Explanation
//
//Explanation 1:
//Buy the stock on day 0, and sell it on day 1.
//Explanation 2:
//
//Buy the stock on day 0, and sell it on day 2.


public class Buy_sell_Stock {

    public static void main(String[] args) {
       int[] A = {1, 4, 5, 2, 4};
        System.out.println(sellstock(A));
    }

    private static int sellstock(int[] A) {

        int N = A.length;
        if(N == 0) return 0;
        int minprice = A[0];
        int maxprofit = 0;
        for(int i=1;i<N;i++){
            int profit = A[i] - minprice;
            maxprofit = Math.max(maxprofit,profit);
            minprice = Math.min(minprice,A[i]);
        }
        return maxprofit;
    }
}

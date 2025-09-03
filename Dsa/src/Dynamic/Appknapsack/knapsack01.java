package Dynamic.Appknapsack;

public class knapsack01 {

    public static void main(String[] args) {
       int[] A = {6, 10, 12};
       int[] B = {10, 20, 30};
       int C = 50;
        System.out.println(knapsack(A,B,C));
    }

    private static int knapsack(int[] A, int[] B, int C) {
        int N = A.length;
        int maxvalue = 50 * N;
        long INF = (long)1e12;
        long[] dp = new long[maxvalue + 1];

        for(int i=1;i<=maxvalue;i++){
           dp[i] = INF;
        }

        dp[0] = 0;

        for(int i=1;i<N;i++){
            for(int val = maxvalue;val >= A[i];val--){
                dp[val] = Math.min(dp[val],B[i]+dp[val-A[i]]);
            }
        }

        for (int val = maxvalue;val >=0;val--){
            if(dp[val] <= C){
                return val;
            }
        }
        return 0;
    }
}

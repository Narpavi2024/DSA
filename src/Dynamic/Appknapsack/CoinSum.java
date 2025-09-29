package Dynamic.Appknapsack;

public class CoinSum {

    public static void main(String[] args) {
       int[] A = {1, 2, 3};
        int B = 4;
        System.out.println(coinsum(A,B));
    }

    private static int coinsum(int[] A, int B) {
        int MOD = 1000007;
        int[] dp = new int[B+1];

        dp[0] = 1;
        for (int coin: A){
            for(int sum = coin;sum <= B;sum++){
                dp[sum] = (dp[sum] + dp[sum-coin]) %MOD;
            }
        }
        return dp[B];
    }
}

package Dynamic.Appknapsack;

public class CuttingRod {
    public static void main(String[] args) {
       int[] A = {3, 4, 1, 6, 2};
        System.out.println(cutting(A));
    }

    private static int cutting(int[] arr) {

        int N = arr.length;
        int[] dp = new int[N+1];

        for(int i=1;i<=N;i++){
            int maxprice = 0;

            for(int j=1;j<=i;j++){
                maxprice = Math.max(maxprice,arr[j-1]+dp[i-j]);
            }
            dp[i] = maxprice;
        }

        return dp[N];
    }
}

package Dynamic.Appknapsack;

public class DistinctSubSeq {

    public static void main(String[] args) {
       String A = "rabbbit";
        String B = "rabbit";
        System.out.println(distinctsub(A,B));
    }

    private static int distinctsub(String A, String B) {

        int m = B.length();
        int n = A.length();

        long[][] dp = new long[m+1][n+1];
        for(int j=0;j<=n;j++){
            dp[0][j] = 1;
        }

        for(int i=1;i<=m;i++){
            dp[i][0] = 0;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(B.charAt(i-1) == A.charAt(j-1)){
                    dp[i][j] = dp[i][j-1] +dp[i-1][j-1];
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }

        return (int) dp[m][n];
    }
}

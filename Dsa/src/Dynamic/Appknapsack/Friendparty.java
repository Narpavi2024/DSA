package Dynamic.Appknapsack;

public class Friendparty {
    private static final int MOD = 10003;

    public static void main(String[] args) {
        System.out.println(frndparty(3));
    }

    private static int frndparty(int A) {

        if(A <= 1) return 1;
        int prev2 = 1;
        int prev1 = 1;

        for(int i=2;i<=A;i++){
            long pairway = ((long)(i-1) * prev2) %MOD;
            int curr = (int)(prev1 + pairway) %MOD;

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

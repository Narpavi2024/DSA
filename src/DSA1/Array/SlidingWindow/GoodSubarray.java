package DSA1.Array.SlidingWindow;

public class GoodSubarray {

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 4;
        System.out.println(subarray(A,B));
    }

    private static int subarray(int[] A, int B) {
        int N = A.length;
        int[] pfsum = new int[N+1];
        int count = 0;

        for(int i=0;i<N;i++){
            pfsum[i+1] = pfsum[i] + A[i];
        }
        for(int start=0;start<N;start++){
            for(int end = start;end<N;end++){
                int lengthsum = end-start+1;
                int subarraysum = pfsum[end+1] - pfsum[start];

                if((lengthsum%2 == 0 && subarraysum < B) || (lengthsum%2 != 0 && subarraysum > B)){
                    count++;
                }
            }
        }
        return count;
    }
}

//TC:O(N^2) and SC:0(N)

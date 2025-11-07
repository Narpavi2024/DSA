package DSA1.Array.OneDimensionalArray;
//Problem Description
//
//Given an array A of length N, your task is to find the maximum possible sum of any non-empty contiguous subarray.
//
//In other words, among all possible subarrays of A, determine the one that yields the highest sum and return that sum.
//
//
//
//Problem Constraints
//
//1 <= N <= 106
//        -1000 <= A[i] <= 1000
//
//
//
//Input Format
//
//The first and the only argument contains an integer array, A.
//
//
//
//Output Format
//
//Return an integer representing the maximum possible sum of the contiguous subarray.
//
//
//
//Example Input
//
//Input 1:
//
//A = [1, 2, 3, 4, -10]
//Input 2:
//
//A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//
//Example Output
//
//Output 1:
//
//        10
//Output 2:
//
//        6
//
//
//Example Explanation
//
//Explanation 1:
//
//The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
//Explanation 2:
//
//The subarray [4,-1,2,1] has the maximum possible sum of 6.

public class MaxsumContiguosSubarray {
    public static void main(String[] args) {
        //int[] A = {1, 2, 3, 4, -10};
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println((maxSubArray(A)));
    }

    private static int maxSubArray(int[] A) {

        //Using Kandene Algorithm only used for for coniguos sum array
        int n = A.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum += A[i];
            max = Math.max(sum,max);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

//TC:O(n) and SC:O(1)

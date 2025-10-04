package TwoDArray;

//Problem Description
//
//You are given a 2D matrix A of integers.
//
//Your task is to compute the sum of elements in each row and return a 1D array where each element represents the sum of a corresponding row in the matrix.
//
//
//Problem Constraints
//
//1 <= A.size() <= 103
//
//
//        1 <= A[i].size() <= 103
//
//        1 <= A[i][j] <= 103
//
//
//
//
//
//
//Input Format
//
//First argument A is a 2D array of integers.(2D matrix).
//
//
//
//Output Format
//
//Return an array containing row-wise sums of original matrix.
//
//
//
//        Example Input
//
//Input 1:
//
//        [1,2,3,4]
//        [5,6,7,8]
//        [9,2,3,4]
//
//
//Example Output
//
//Output 1:
//
//        [10,26,18]
//
//
//Example Explanation
//
//Explanation 1
//
//Row 1 = 1+2+3+4 = 10
//Row 2 = 5+6+7+8 = 26
//Row 3 = 9+2+3+4 = 18


import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}};
        System.out.println(Arrays.toString(rowsum(A)));
    }

    private static int[] rowsum(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                ans[i] += A[i][j];
            }
        }
        return ans;
    }
}

//TC:O(N*M) SC:O(N)

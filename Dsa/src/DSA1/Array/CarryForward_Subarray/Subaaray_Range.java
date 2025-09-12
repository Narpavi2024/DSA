package DSA1.Array.CarryForward_Subarray;

import java.util.Arrays;

//Problem Description
//
//Given an array A of length N, return the subarray from B to C.
//
//
//Problem Constraints
//
//1 <= N <= 105
//
//        1 <= A[i] <= 109
//
//        0 <= B <= C < N
//
//
//
//Input Format
//
//The first argument A is an array of integers
//
//The remaining argument B and C are integers.
//
//
//
//Output Format
//
//Return a subarray
//
//
//Example Input
//
//Input 1:
//A = [4, 3, 2, 6]
//B = 1
//C = 3
//Input 2:
//
//A = [4, 2, 2]
//B = 0
//C = 1
//
//
//Example Output
//
//Output 1:
//        [3, 2, 6]
//Output 2:
//
//        [4, 2]
//

public class Subaaray_Range {

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6};
        int B = 1;
        int C = 3;
        System.out.println(Arrays.toString(subarray(A, B, C)));
    }

    private static int[] subarray(int[] A, int B, int C) {
        int[] ans = new int[C-B+1];
        for(int i=B;i<=C;i++){
            ans[i-B] = A[i];
        }
        return ans;
    }
}

package DSA1.Array.Prefixsum;

import java.util.Arrays;

public class InPlace_Prefixsum {
//    Problem Description
//
//    Given an array A of N integers. Construct prefix sum of the array in the given array itself.
//
//
//            Problem Constraints
//
//1 <= N <= 105
//            1 <= A[i] <= 103
//
//
//    Input Format
//
//    Only argument A is an array of integers.
//
//
//    Output Format
//
//    Return an array of integers denoting the prefix sum of the given array.
//
//
//            Example Input
//
//    Input 1:
//
//    A = [1, 2, 3, 4, 5]
//    Input 2:
//
//    A = [4, 3, 2]
//
//
//    Example Output
//
//    Output 1:
//
//            [1, 3, 6, 10, 15]
//    Output 2:
//
//            [4, 7, 9]
    public static void main(String[] args) {
       int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prefixsum(A)));
    }

    private static int[] prefixsum(int[] A) {

        int N = A.length;
        int[] PF = new int[N];
        PF[0] = A[0];
        for(int i=1;i<N;i++){
            PF[i] = PF[i-1] + A[i];
        }
        return PF;
    }
}

package DSA1.Array.CarryForward_Subarray;

import java.util.Arrays;

//Problem Description
//
//You are given an array A of N integers.
//Return a 2D array consisting of all the subarrays of the array
//
//Note : The order of the subarrays in the resulting 2D array does not matter.
//
//
//Problem Constraints
//
//1 <= N <= 100
//        1 <= A[i] <= 105
//
//
//Input Format
//
//First argument A is an array of integers.
//
//
//Output Format
//
//Return a 2D array of integers in any order.
//
//
//Example Input
//
//Input 1:
//A = [1, 2, 3]
//Input 2:
//A = [5, 2, 1, 4]
//
//
//Example Output
//
//Output 1:
//        [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
//Output 2:
//        [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
//
//
//Example Explanation
//
//For Input 1:
//All the subarrays of the array are returned. There are a total of 6 subarrays.
//For Input 2:
//All the subarrays of the array are returned. There are a total of 10 subarrays.

public class Generate_SubArray {

    public static void main(String[] args) {
       int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(generatesubarray(A)));
    }

    private static int[][] generatesubarray(int[] A) {
        int n = A.length;
        int numsubarr = n*(n+1)/2;
        int[][] result = new int[numsubarr][];
        int index = 0;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                 int[] subarr = new int[ei-si+1];
                for(int j=si;j<=ei;j++){
                    subarr[j-si] = A[j];
                }
                result[index++] = subarr;
            }
        }
        return result;
    }
}

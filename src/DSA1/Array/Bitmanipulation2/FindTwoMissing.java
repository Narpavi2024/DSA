package DSA1.Array.Bitmanipulation2;

//Problem Description
//
//Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
//
//Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
//
//
//
//        Problem Constraints
//
//1 <= N <= 105
//
//        1 <= A[i] <= N+2
//
//The elements of array A are distinct
//
//
//
//Input Format
//
//Only argument A is an array of integers
//
//
//
//Output Format
//
//Return a sorted array of size 2 denoting the missing elements.
//
//
//
//Example Input
//
//Input 1:
//A = [3, 2, 4]
//Input 2:
//A = [5, 1, 3, 6]
//
//
//Example Output
//
//Output 1:
//        [1, 5]
//Output 2:
//        [2, 4]
//
//
//Example Explanation
//
//For Input 1:
//The missing numbers are 1 and 5.
//For Input 2:
//The missing numbers are 2 and 4.

import java.util.Arrays;

public class FindTwoMissing {
    public static void main(String[] args) {
      int[] A = {3, 2, 4};
        System.out.println(Arrays.toString(findtwomissing(A)));
    }

    private static int[] findtwomissing(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n+3];
        for(int num:A){
            present[num] = true;
        }
        int firstmissing = -1,secondmissing = -1;
        for(int i=1;i<=n+2;i++){

            if(!present[i]){
                if(firstmissing == -1){
                    firstmissing = i;
                }else{
                    secondmissing = i;
                    break;
                }
            }
        }
        return new int[]{firstmissing,secondmissing};
    }
}

//TC:O(n) and SC:O(n)

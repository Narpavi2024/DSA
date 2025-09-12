package DSA1.Array.CarryForward_Subarray;
//Problem Description
//
//Given an array A of N non-negative numbers and a non-negative number B,
//you need to find the number of subarrays in A with a sum less than B.
//We may assume that there is no overflow.
//
//
//
//Problem Constraints
//
//1 <= N <= 5 x 103
//
//
//        1 <= A[i] <= 1000
//
//        1 <= B <= 107
//
//
//
//
//Input Format
//
//First argument is an integer array A.
//
//Second argument is an integer B.
//
//
//
//Output Format
//
//Return an integer denoting the number of subarrays in A having sum less than B.
//
//
//
//        Example Input
//
//Input 1:
//
//A = [2, 5, 6]
//B = 10
//Input 2:
//
//A = [1, 11, 2, 3, 15]
//B = 10
//
//
//Example Output
//
//Output 1:
//
//        4
//Output 2:
//
//        4
public class Counting_SubArray {

    public static void main(String[] args) {
       int[] A = {2, 5, 6};
       int B = 10;
        System.out.println(countsubarray(A,B));
    }

    private static int countsubarray(int[] A, int B) {
        int count = 0;
        int currentsum = 0;
        int start = 0;
        for(int end = 0;end < A.length;end++){
            currentsum += A[end];

            while(currentsum >= B && start <= end){
                currentsum -= A[start];
                start++;
            }
            count += end-start+1;
        }
        return count;
    }
}

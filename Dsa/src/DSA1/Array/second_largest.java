package DSA1.Array;

//Problem Description
//
//You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
//
//
//        Problem Constraints
//
//1 <= |A| <= 105
//
//
//        0 <= A[i] <= 109
//
//
//
//
//
//Input Format
//
//The first argument is an integer array A.
//
//
//
//
//
//Output Format
//
//Return the second largest element. If no such element exist then return -1.
//
//
//
//Example Input
//
//Input 1:
//
//A = [2, 1, 2]
//Input 2:
//
//A = [2]
//
//
//Example Output
//
//Output 1:
//
//        1
//Output 2:
//
//        -1
//
//
//Example Explanation
//
//Explanation 1:
//
//First largest element = 2
//Second largest element = 1
//Explanation 2:
//
//There is no second largest element in the array.
public class second_largest {

    public static void main(String[] args) {
       int[] A = {2};
        System.out.println(seconlarg(A));
    }

    private static int seconlarg(int[] A) {
        int N = A.length;

        int firstmax = A[0];

        for(int i=1;i<N;i++){
            if(A[i] > firstmax){
                firstmax = A[i];
            }
        }

        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i] != firstmax && A[i] > secondmax){
                secondmax = A[i];
            }
        }

        return secondmax == Integer.MIN_VALUE? -1:secondmax;
    }
}

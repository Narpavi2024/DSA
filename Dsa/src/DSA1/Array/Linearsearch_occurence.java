package DSA1.Array;

public class Linearsearch_occurence {
//    Linear Search - Multiple Occurences
//    Solved
//    feature icon
//    Using hints except Complete Solution is Penalty free now
//    Use Hint
//    Problem Description
//
//    Given an array A and an integer B, find the number of occurrences of B in A.
//
//
//    Problem Constraints
//
//1 <= B, Ai <= 109
//            1 <= length(A) <= 105
//
//
//    Input Format
//
//    Given an integer array A and an integer B.
//
//
//            Output Format
//
//    Return an integer, number of occurrences of B in A.
//
//
//            Example Input
//
//    Input 1:
//    A = [1, 2, 2], B = 2
//    Input 2:
//    A = [1, 2, 1], B = 3
//
//
//    Example Output
//
//    Output 1:
//            2
//    Output 2:
//            0
//
//
//    Example Explanation
//
//    Explanation 1:
//    Element at index 2, 3 is equal to 2 hence count is 2.
//    Explanation 2:
//    There is no element equal to 3 in the array.
    public static void main(String[] args) {
      int[] A = {1, 2, 1};
        int B = 3;
        System.out.println(findOccurence(A,B));
    }

    private static int findOccurence(int[] A, int B) {
        int N = A.length;
        int count = 0;
        for(int i=0;i<N;i++){
            if(A[i] == B){
               count++;
            }
        }
        return count;
    }
}

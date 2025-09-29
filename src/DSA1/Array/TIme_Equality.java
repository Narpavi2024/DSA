package DSA1.Array;

public class TIme_Equality {

//    Time to equality
//            Solved
//    feature icon
//    Using hints except Complete Solution is Penalty free now
//    Use Hint
//    Problem Description
//
//    Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//
//    Find the minimum time in seconds to make all elements of the array equal.
//
//
//    Problem Constraints
//
//1 <= N <= 1000000
//            1 <= A[i] <= 1000
//
//
//    Input Format
//
//    First argument is an integer array A.
//
//
//            Output Format
//
//    Return an integer denoting the minimum time to make all elements equal.
//
//
//    Example Input
//
//    A = [2, 4, 1, 3, 2]
//
//
//    Example Output
//
//8
//
//
//    Example Explanation
//
//    We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        System.out.println(timeequal(A));
    }

    private static int timeequal(int[] A) {

        int N = A.length;
        int max = A[0];

        for(int i=1;i<N;i++){
            if(A[i] > max){
                max = A[i];
            }
        }

        int totaltime = 0;

        for(int i=0;i<N;i++){
            totaltime += max - A[i];
        }

        return totaltime;
    }
}

package DSA1.Array.InterviewProblem;

//Problem Description
//
//You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
//If so, return the integer. If not, return -1.
//
//If there are multiple solutions, return any one.
//
//Note: Read-only array means that the input array should not be modified in the process of solving the problem
//
//
//
//Problem Constraints
//
//1 <= N <= 7*105
//        1 <= A[i] <= 109
//
//
//Input Format
//
//The only argument is an integer array A.
//
//
//Output Format
//
//Return an integer.
//
//
//        Example Input
//
//Input 1:
//        [1 2 3 1 1]
//Input 2:
//        [1 2 3]
//
//
//Example Output
//
//Output 1:
//        1
//Output 2:
//        -1
//
//
//Example Explanation
//
//Explanation 1:
//        1 occurs 3 times which is more than 5/3 times.
//        Explanation 2:
//No element occurs more than 3 / 3 = 1 times in the array.

public class RepeatNumber {

    public static void main(String[] args) {

        int[] A = {1,2,3,1,1};
        System.out.println(reparnumber(A));

    }

    private static int reparnumber(int[] A) {
        int n = A.length;
        int canditate1 = 0, canditate2 = 0, count1 = 0, count2 = 0;
        for (int num : A) {
            if (canditate1 == num) {
                count1++;
            } else if (canditate2 == num) {
                count2++;
            } else if (count1 == 0) {
                canditate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                canditate2 = num;
                count2 = 1;
            } else {
             count1--;
             count2--;
            }

        }
        count1 = 0;
        count2 = 0;
        for (int num:A){
            if(num == canditate1){
             count1++;
            } else if (num == canditate2) {
                count2++;
            }
        }

        if(count1 > n/3) return canditate1;

        if(count2 > n/3) return canditate2;

        return -1;
    }
}

//TC:O(N) and SC:)(1)

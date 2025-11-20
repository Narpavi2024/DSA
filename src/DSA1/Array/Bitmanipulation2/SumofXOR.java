package DSA1.Array.Bitmanipulation2;

//Problem Description
//
//Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.
//
//Since the answer can be large, return the remainder after the dividing the answer by 109+7.
//
//
//
//Problem Constraints
//
//1 <= N <= 105
//
//        1 <= A[i] < 109
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
//Return an integer denoting the sum of xor of all pairs of number in the array.
//
//
//
//Example Input
//
//Input 1:
//A = [1, 2, 3]
//Input 2:
//A = [3, 4, 2]
//
//
//Example Output
//
//Output 1:
//        6
//Output 2:
//        14
//
//
//Example Explanation
//
//For Input 1:
//Pair    Xor
//{1, 2}  3
//        {1, 3}  2
//        {2, 3}  1
//Sum of xor of all pairs = 3 + 2 + 1 = 6.
//For Input 2:
//Pair    Xor
//{3, 4}  7
//        {3, 2}  1
//        {4, 2}  6
//Sum of xor of all pairs = 7 + 1 + 6 = 14.


public class SumofXOR {
    public static void main(String[] args) {

        int[] A = {1,2,3};
        System.out.println(sumofxor(A));

    }

    private static int sumofxor(int[] A) {
        long ans = 0;
        for(int i=0;i<31;i++){
         int set = 0;
         for(int j=0;j<A.length;j++){
             if((A[j] & (1<<i)) != 0){
                 set++;
             }
         }
         int unset = A.length - set;
         long total = (long) set * unset;
         ans = ans + total * (1<<i);
        }
        return (int)(ans%1000000007);
    }
}

//TC:O(N) and SC:O(1)

package DSA1.Array.Bitmanipulation2;

//Problem Description
//
//Given an array of integers, every element appears thrice except for one, which occurs once.
//
//Find that element that does not appear thrice.
//
//NOTE: Your algorithm should have a linear runtime complexity.
//
//Could you implement it without using extra memory?
//
//
//
//
//Problem Constraints
//
//2 <= |A| <= 5*106
//
//        0 <= A[i] <= INTMAX
//
//
//
//Input Format
//
//First and only argument of input contains an integer array A.
//
//
//
//        Output Format
//
//Return a single integer.
//
//
//
//Example Input
//
//Input 1:
//
//A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
//Input 2:
//
//A = [0, 0, 0, 1]
//
//
//Example Output
//
//Output 1:
//
//        4
//Output 2:
//
//        1
//
//
//Example Explanation
//
//Explanation 1:
//
//        4 occurs exactly once in Input 1.
//        1 occurs exactly once in Input 2.



public class SingleNumber2 {

    public static void main(String[] args) {
       int[] A = {0, 0, 0, 1};
        System.out.println(singlenumber2(A));
    }

    private static int singlenumber2(int[] A) {
        int result = 0;

        for(int bit=0;bit<32;bit++){
            int sum = 0;
            for (int x:A){
                if ((x & (1<<bit)) != 0){
                    sum++;
                }
            }
            if (sum %3 !=0){
               result |= (1<<bit);
            }
        }
     return result;

    }
}

// TC:O(N) and SC:O(1)

package DSA1.Array.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOnetoNumber {

//    Problem Description
//
//    Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
//
//
//
//
//
//
//    The digits are stored such that the most significant digit is at the head of the list.
//
//            NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
//
//    Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
//    A: For the purpose of this question, YES
//    Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
//    A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
//
//
//
//
//
//
//
//            Problem Constraints
//
//1 <= size of the array <= 1000000
//
//
//
//    Input Format
//
//    First argument is an array of digits.
//
//
//
//            Output Format
//
//    Return the array of digits after adding one.
//
//
//
//    Example Input
//
//    Input 1:
//
//            [1, 2, 3]
//
//
//    Example Output
//
//    Output 1:
//
//            [1, 2, 4]
//
//
//    Example Explanation
//
//    Explanation 1:
//
//    Given vector is [1, 2, 3].
//    The returned vector should be [1, 2, 4] as 123 + 1 = 124.


    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(plusOne(A));

    }

    private static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size();
        int carry = 1;
        int num;
        //traversing the digits of number in reverse order
        for (int i = n-1;i>=0;i--){
            num = A.get(i);
            num += carry;
            carry = 0;

            if(num == 10){
                num = 0;
                carry = 1;
            }
            A.set(i,num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (carry == 1) result.add(1);
        for(int x:A){
            if(x == 0 && result.size() == 0) continue;
            result.add(x);
        }
        return result;
    }
}

// TC:O(N) SC:O(N)

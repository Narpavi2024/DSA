package DSA1.Array.Bitmanipulation2;
//Problem Description
//
//Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
//Find the two integers that appear only once.
//
//Note: Return the two numbers in ascending order.
//
//
//        Problem Constraints
//
//2 <= |A| <= 100000
//        1 <= A[i] <= 109
//
//
//
//Input Format
//
//The first argument is an array of integers of size N.
//
//
//
//        Output Format
//
//Return an array of two integers that appear only once.
//
//
//
//Example Input
//
//Input 1:
//A = [1, 2, 3, 1, 2, 4]
//Input 2:
//
//A = [1, 2]
//
//
//Example Output
//
//Output 1:
//        [3, 4]
//Output 2:
//
//        [1, 2]
//
//
//Example Explanation
//
//Explanation 1:
//        3 and 4 appear only once.
//        Explanation 2:
//
//        1 and 2 appear only once.


import java.util.Arrays;

public class SingleNumber3 {

    public static void main(String[] args) {
       int[] A = {1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(singlenumber3(A)));
    }

    private static int[] singlenumber3(int[] A) {

        int xor = 0;

        for (int num:A){
            xor ^= num;
        }
        int rsb = xor & -xor;
        int x =0,y=0;
        for(int num: A){
         if ((num & rsb) != 0){
             x ^= num;
         }else{
             y ^= num;
         }
        }

        if (x<y) return new int[]{x,y};
        return new int[]{y,x};
    }
}

//TC:O(N) ans SC:0(1)

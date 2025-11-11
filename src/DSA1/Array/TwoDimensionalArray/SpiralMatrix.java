package DSA1.Array.TwoDimensionalArray;

import java.util.Arrays;

//Problem Description
//
//Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
//
//
//
//Problem Constraints
//
//1 <= A <= 1000
//
//
//
//Input Format
//
//First and only argument is integer A
//
//
//Output Format
//
//Return a 2-D matrix which consists of the elements added in spiral order.
//
//
//
//        Example Input
//
//Input 1:
//
//        1
//Input 2:
//
//        2
//Input 3:
//
//        5
//
//
//Example Output
//
//Output 1:
//
//        [ [1] ]
//Output 2:
//
//        [ [1, 2],
//        [4, 3] ]
//Output 3:
//
//        [ [1,   2,  3,  4, 5],
//        [16, 17, 18, 19, 6],
//        [15, 24, 25, 20, 7],
//        [14, 23, 22, 21, 8],
//        [13, 12, 11, 10, 9] ]



public class SpiralMatrix {
    public static void main(String[] args) {
       int A = 2;
        System.out.println(Arrays.deepToString(generateMatrix(A)));
    }

    private static int[][] generateMatrix(int A) {

        int[][] ans = new int[A][A];
        int row = 0,col = 0,count = 1;
        while (A > 1){
            for(int i=1;i<A;i++){  //Move right
                ans[row][col] = count;
                col++;
                count++;
            }
            for (int i=1;i<A;i++){ // Move Down
                ans[row][col] = count;
                row++;
                count++;
            }
            for (int i=1;i<A;i++){ // Move Left
                ans[row][col] = count;
                col--;
                count++;
            }
            for (int i=1;i<A;i++){ // Move UP
                ans[row][col] = count;
                row--;
                count ++;
            }
            row += 1;
            col += 1;
            A -= 2;
        }

        if(A == 1){
            ans[row][col] = count;
        }
        return ans;
    }
}

//TC:O(A^2) ans SC:O(1)

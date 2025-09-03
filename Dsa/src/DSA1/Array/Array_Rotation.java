package DSA1.Array;

import java.util.Arrays;

public class Array_Rotation {

    public static void main(String[] args) {
       int[]  A = {1, 2, 3, 4};
       int B = 2;
        System.out.println(Arrays.toString(Rotation_array(A, B)));
    }

    private static int[] Rotation_array(int[] A, int B) {
        int N =A.length;
        B = B%N;
        
        //reverse the whole array
        reverse_array(A,0,N-1);
        // reverse the Bth array
        reverse_array(A,0,B-1 );
        reverse_array(A,B,N-1);
        
        return A;
    }

    private static void reverse_array(int[] A, int B, int C) {
        int i = B,j = C;

        while (i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
}

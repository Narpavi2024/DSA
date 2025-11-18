package Bitmanipulation2;

import java.util.Arrays;

public class MinXorValue {
    public static void main(String[] args) {
       int[] A = {0, 2, 5, 7};

        System.out.println(findminxor(A));
    }

    private static int findminxor(int[] A) {
        Arrays.sort(A);
        int minxorvalue = Integer.MAX_VALUE;
        for(int i=0;i<A.length-1;i++){
             int xorvalue = A[i] ^ A[i+1];
             minxorvalue = Math.min(minxorvalue,xorvalue);
        }
        return minxorvalue;
    }
}

//TC:O(nlogn) and SC:O(logn)

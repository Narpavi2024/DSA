package DSA1.Array.Recursion1;

public class DecreasingIncreasing {
    public static void main(String[] args) {
        int A=4;

        DecThenInc1(A);
    }

    private static void DecThenInc1(int A) {
        if(A == 0) return ;

        System.out.print(A+" ");

        DecThenInc1(A-1);

        System.out.print(A+ " ");
    }
}

//TC:O(A) and SC:O(A)

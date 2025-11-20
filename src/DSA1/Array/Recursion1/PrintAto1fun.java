package DSA1.Array.Recursion1;

public class PrintAto1fun {
    public static void main(String[] args) {
        int A = 5;
        printnumberAto1(A);
        System.out.println();
    }

    private static void printnumberAto1(int A) {
        if(A == 0) return;

        System.out.println(A+ " ");
        printnumberAto1(A-1);
    }
}

//TC:O(A) and SC:O(A)

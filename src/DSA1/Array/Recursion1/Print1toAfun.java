package DSA1.Array.Recursion1;

public class Print1toAfun {
    public static void main(String[] args) {
        int A = 5;
        printnumber(1,A);
        System.out.println();
    }


    private static void printnumber(int current, int A) {
        if (current > A) return;

        System.out.print(current+" ");
        printnumber(current+1,A);
    }
}

//TC:O(A) and SC:O(A)

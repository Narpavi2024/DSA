package DSA1.Array.Recursion1;

public class FindFibnocci {
    public static void main(String[] args) {
       int A = 9;
        System.out.println(findfibnocci(A));
    }

    private static int findfibnocci(int A) {
        if(A == 0){
            return 0;
        }
        if(A == 1){
            return 1;
        }

        return findfibnocci(A-1) + findfibnocci(A-2);
    }
}

//TC:O(2^n) and SC:O(n)

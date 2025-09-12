package DSA1.Array.CarryForward_Subarray;

public class Special_Subsequences {
//    Problem Description
//
//    You have given a string A having Uppercase English letters.
//
//    You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
//
//
//
//    Problem Constraints
//
//1 <= length(A) <= 105
//
//
//
//    Input Format
//
//    First and only argument is a string A.
//
//
//
//    Output Format
//
//    Return an long integer denoting the answer.
//
//
//
//            Example Input
//
//    Input 1:
//
//    A = "ABCGAG"
//    Input 2:
//
//    A = "GAB"
//
//
//    Example Output
//
//    Output 1:
//
//            3
//    Output 2:
//
//            0

    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(specialsubseq(A));
    }

    private static long specialsubseq(String A) {
        int N = A.length();
        int countA = 0;
        long ans = 0;

        for(int i=0;i<N;i++){
            if(A.charAt(i) == 'A'){
                countA++;
            }else if (A.charAt(i) == 'G'){
                ans += countA;
            }
        }
        return ans;
    }
}

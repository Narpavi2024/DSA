package DSA1.Array.String;
//
//Problem Description
//
//Given a string A, you are asked to reverse the string and return the reversed string.
//
//
//
//        Problem Constraints
//
//1 <= |A| <= 105
//
//DSA1.Array.String A consist only of lowercase characters.
//
//
//
//        Input Format
//
//First and only argument is a string A.
//
//
//
//Output Format
//
//Return a string denoting the reversed string.
//
//
//
//        Example Input
//
//Input 1:
//
//A = "scaler"
//Input 2:
//
//A = "academy"
//
//
//Example Output
//
//Output 1:
//
//        "relacs"
//Output 2:
//
//        "ymedaca"
//
//
//Example Explanation
//
//Explanation 1:
//
//Reverse the given string.




public class SimpleReverse {

    public static void main(String[] args) {
         String  A = "scaler";
        System.out.println(Reversestr(A));
    }

    private static String Reversestr(String A) {
        int n = A.length();
        char[] arr = A.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return new String(arr);
    }
}

//TC: O(N) and SC:O(N)
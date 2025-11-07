package DSA1.Array.OneDimensionalArray;

//Problem Description
//
//Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
//
//Your task is to calculate the total amount of water that can be trapped in these valleys.
//
//        Example:
//
//The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.
//
//
//Rain Water Trapped
//
//
//
//
//Problem Constraints
//
//1 <= |A| <= 105
//        0 <= A[i] <= 105
//
//
//
//Input Format
//
//First and only argument is the Integer Array, A.
//
//
//
//Output Format
//
//Return an Integer, denoting the total amount of water that can be trapped in these valleys
//
//
//
//Example Input
//
//Input 1:
//
//A = [0, 1, 0, 2]
//Input 2:
//
//A = [1, 2]
//
//
//Example Output
//
//Output 1:
//
//        1
//Output 2:
//
//        0
//
//
//Example Explanation
//
//Explanation 1:
//
//        1 unit is trapped on top of the 3rd element.
//Rain Water Histogram
//Explanation 2:
//
//No water is trapped.


public class RainTrappedWater {
    public static void main(String[] args) {
       //int[] A = {0, 1, 0, 2};
       int[] A = {1, 2};
        System.out.println(trap(A));
    }

    private static int trap(int[] A) {
        int n = A.length;
        int[] psum = new int[n];
        psum[0] = A[0];
        for (int i=1;i<n;i++){
            psum[i] = Math.max(psum[i-1],A[i]);
        }
        int[] Ssum = new int[n];
        Ssum[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            Ssum[i] = Math.max(Ssum[i+1],A[i]);
        }
        int total = 0;
        for(int i=0;i<n;i++){
            int lb = psum[i],rb = Ssum[i];
            int waterht = Math.min(lb,rb);
            total += waterht - A[i];
        }
        return total;
    }
}

//TC:O(N) SC:O(1)

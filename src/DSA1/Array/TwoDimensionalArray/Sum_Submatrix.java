package DSA1.Array.TwoDimensionalArray;

public class Sum_Submatrix {

    public static void main(String[] args) {
        int[][] A = {{1, 1},
                {1, 1}};
        System.out.println(sumsubmatrix(A));
    }

    private static int sumsubmatrix(int[][] A) {
        int n =A.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int topleft = (i+1) * (j+1);
                int bottomright = (n-i) * (n-j);
                int submatrixcnt = topleft * bottomright;
                sum += submatrixcnt * A[i][j];
            }
        }
        return sum;
    }
}


//TC:O(N^2) SC:O(1)
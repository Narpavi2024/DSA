package Dynamic.Appknapsack;

import java.util.HashMap;
import java.util.Map;

public class longestfibno {

    public static void main(String[] args) {
       int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(longfibno(A));
    }

    private static int longfibno(int[] A) {

        int n = A.length;

        if(n<3) return 0;

        Map<Integer,Integer> indexmap = new HashMap<>();
        for(int i=0;i<n;i++){
            indexmap.put(A[i],i);
        }
        int[][] longest = new int[n][n];
        int maxlength = 0;

        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                int needed = A[k] - A[j];
                Integer i = indexmap.get(needed);

                if(i != null && i<j){
                    longest[j][k] = longest[i][j] > 0 ? longest[i][j]+1 : 3;
                    maxlength = Math.max(maxlength,longest[j][k]);
                }
            }
        }

        return maxlength;
    }
}

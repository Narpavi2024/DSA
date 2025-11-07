package DSA1.Array.InterviewProblem;

public class IncreasingTriplets {

    public static void main(String[] args) {
       int[] A = {1, 2, 4, 3};
        System.out.println(triplets(A));
    }

    private static int triplets(int[] A) {

        int n = A.length;
        int triplets = 0;

        for(int j=1;j<n-1;j++){
            int leftcnt = 0;
            int rightcnt = 0;
            for(int i =0;i<j;i++){
                if(A[i] < A[j]){
                    leftcnt++;
                }
            }
            for(int k=j+1;k<n;k++){
                if(A[k] > A[j]){
                    rightcnt++;
                }
            }

            triplets += leftcnt * rightcnt;
        }
        return triplets;
    }
}


// TC:O(N^2) and SC:O(1)

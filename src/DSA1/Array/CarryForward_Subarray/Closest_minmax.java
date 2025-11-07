package DSA1.Array.CarryForward_Subarray;

//Problem Description
//
//Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//
//and at least one occurrence of the minimum value of the array.
//
//
//
//Problem Constraints
//
//1 <= |A| <= 2000
//
//
//
//Input Format
//
//First and only argument is vector A
//
//
//
//Output Format
//
//Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
//
//
//
//Example Input
//
//Input 1:
//
//A = [1, 3, 2]
//Input 2:
//
//A = [2, 6, 1, 6, 9]
//
//
//Example Output
//
//Output 1:
//
//        2
//Output 2:
//
//        3
//
//
//Example Explanation
//
//Explanation 1:
//
//Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
//        Explanation 2:
//
//Take the last 3 elements of the array.


public class Closest_minmax {
    public static void main(String[] args) {
        int[] A = {1, 3, 2};
       // int[] A = {2, 6, 1, 6, 9};
        
        System.out.println(closestminmax(A));
    }

    private static int closestminmax(int[] A){
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num:A){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        if(min == max) return 1;
        int lastmin = -1;
        int lastmax = -1;
        int smallestsubarrlen = n;
        for(int i=0;i<n;i++){

            if(A[i] == min){
                lastmin = i;
                if(lastmax != -1){
                    smallestsubarrlen = Math.min(smallestsubarrlen,i-lastmax+1);
                }

            }else if(A[i] == max){
                lastmax = i;
                if(lastmin != -1){
                    smallestsubarrlen = Math.min(smallestsubarrlen,i-lastmin+1);
                }

            }
        }
        return smallestsubarrlen;
    }
}

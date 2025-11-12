package DSA1.Array.InterviewProblem1;

//Problem Description
//
//You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this new interval into the set of intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//
//
//Problem Constraints
//
//0 <= |intervals| <= 105
//
//
//
//Input Format
//
//First argument is the vector of intervals
//
//second argument is the new interval to be merged
//
//
//
//Output Format
//
//Return the vector of intervals after merging
//
//
//
//Example Input
//
//Input 1:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
//Input 2:
//
//Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
//
//
//Example Output
//
//Output 1:
//
//        [ [1, 5], [6, 9] ]
//Output 2:
//
//        [ [1, 9] ]
//
//
//Example Explanation
//
//Explanation 1:
//
//        (2,5) does not completely merge the given intervals
//Explanation 2:
//
//        (2,6) completely merges the given intervals

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,3)));
        A.add(new ArrayList<>(Arrays.asList(6,9)));

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2,5));
        System.out.println(mergeinterval2(A,B));

    }

    private static ArrayList<ArrayList<Integer>> mergeinterval2(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        int i=0;
        int n = A.size();

        int newstart = B.get(0);
        int newend = B.get(1);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (i<n && A.get(i).get(1) < newstart){
                result.add(A.get(i));
                i++;
        }
        while (i<n && A.get(i).get(0) <= newend){
          newstart = Math.min(newstart,A.get(i).get(0));
          newend = Math.max(newend,A.get(i).get(1));
          i++;
        }
        ArrayList<Integer> mergedinterval = new ArrayList<>();
        mergedinterval.add(newstart);
        mergedinterval.add(newend);
        result.add(mergedinterval);

        while (i<n){
            result.add(A.get(i));
            i++;
        }

        return result;
    }
}

//TC:O(N) and SC:O(N)

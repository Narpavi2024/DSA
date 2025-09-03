package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Max_depth {
   private static int maxdepth = 0;
    private static int[] depth;


    public static void main(String[] args) {
        int A = 5;
        int[] B = {1, 4, 3, 1};
        int[] C = {5, 2, 4, 4};
        int[] D = {7, 38, 27, 37, 1};
        int[] E = {1, 1, 2};
        int[] F = {32, 18, 26};
        System.out.println(Arrays.toString(maxdepth(A, B, C, D, E, F)));
    }

    private static int[] maxdepth(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {
        ArrayList[] graph = new ArrayList[A+1];

        for(int i=1;i<=A;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<B.length;i++){
            graph[B[i]].add(C[i]);
            graph[C[i]].add(B[i]);
        }

        depth = new int[A+1];

        boolean[] visited = new boolean[A+1];
        List<List<Integer>> levelbucket = new ArrayList<>();
        DFS(1,0,graph,D,visited,levelbucket);

        for(List<Integer> list: levelbucket){
            Collections.sort(list);
        }

        int q = E.length;
        int[] ans = new int[q];
        for(int i=0;i<q;i++){
            int L = E[i];
            int x = F[i];
            int level = L % (maxdepth+1);
            List<Integer> list = levelbucket.get(level);
            ans[i] = binarysearch(list,x);
        }
        return ans;
    }

    private static int binarysearch(List<Integer> list, int x) {
        int lo =0,hi = list.size()-1,ans=-1;
        while (lo <=hi){
            int mid = lo +(hi-lo) / 2;
            if(list.get(mid) >= x){
                ans = list.get(mid);
                hi = mid-1;
            }else {
                lo = mid+1;
            }
        }
        return ans;
    }

    private static void DFS(int node, int d, List<Integer>[] graph, int[] D, boolean[] visited, List<List<Integer>> levelbucket) {
        visited[node] = true;
        depth[node] = d;
        maxdepth = Math.max(maxdepth,d);
        while (levelbucket.size() <= d){
            levelbucket.add(new ArrayList<>());
        }
        levelbucket.get(d).add(D[node-1]);

        for(int nei: graph[node]){
            if(!visited[nei]){
                DFS(nei,d+1,graph,D,visited,levelbucket);
            }
        }
    }
}

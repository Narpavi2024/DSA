package Graph2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class TopologicalSort {

    public static void main(String[] args) {
       int A = 6;
       int[][] B = {{6, 3},
               {6, 1},
               {5, 1},
               {5, 2},
               {3, 4},
               {4, 2} };

        System.out.println(Arrays.toString(toposort(A,B)));
    }

    private static int[] toposort(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=A;i++){
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[A+1];
        for(int[] edges:B){
            int u = edges[0],v = edges[1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=1;i<=A;i++){
            if (indegree[i] == 0){
                pq.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (pq.size() > 0){
            int u = pq.poll();
            topo.add(u);

            for(int v: graph.get(u)){
                indegree[v]--;
                if (indegree[v] == 0) pq.add(v);
            }
        }

        if(topo.size() != A) return new int[0];

        int[] ans = new int[A];
        for(int i=0;i<A;i++){
            ans[i] = topo.get(i);
        }
        return ans;
    }
}

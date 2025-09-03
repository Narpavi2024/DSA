package Graph2;

import java.util.*;

public class AnotherBFS {

    public static void main(String[] args) {
       int A = 6;
       int[][] B = {
               {2, 5, 1},
               {1, 3, 1},
               {0, 5, 2},
               {0, 2, 2},
               {1, 4, 1},
               {0, 1, 1}};
       int C = 3, D = 2;
        System.out.println(anothebfs(A,B,C,D));
    }

    private static int anothebfs(int A, int[][] B, int C, int D) {
        List<List<Integer>> graph = new ArrayList<>();

        int newnode = A;

        for(int i=0;i<A+B.length;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge:B){
            int u = edge[0],v = edge[1],w=edge[2];
            if(w == 1){
                graph.get(u).add(v);
                graph.get(v).add(u);
            }else{
               graph.get(u).add(newnode);
               graph.get(newnode).add(u);
               graph.get(newnode).add(v);
               graph.get(v).add(newnode);
               newnode++;
            }

        }

        int[] dist = new int[newnode];
        Arrays.fill(dist,-1);

        Queue<Integer> q = new LinkedList<>();
        q.add(C);
        dist[C] = 0;

        while (q.size() > 0){
            int curr = q.poll();
            for(int nei: graph.get(curr)){
             if (dist[nei] == -1){
                 dist[nei] = dist[curr]+1;
                 q.add(nei);
             }
            }
        }

        return dist[D];

    }
}

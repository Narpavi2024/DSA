package Graph2;

import java.util.ArrayList;
import java.util.List;

public class Course_scheduled {

    public static void main(String[] args) {

       int A = 3;
       int[] B = {1, 2};
      int[] C = {2, 3};
        System.out.println(coursesolve(A,B,C));
    }

    private static int coursesolve(int A, int[] B, int[] C) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<=A;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<B.length;i++){
            graph.get(B[i]).add(C[i]);
        }

        int[] visited = new int[A+1];

        for(int i=1;i <= A;i++){
            if(visited[i] == 0){
                if (hasCycle(graph,visited,i)) {
                    return 0;
                }
            }
        }

        return 1;
    }

    private static boolean hasCycle(List<List<Integer>> graph, int[] visited, int node) {
        visited[node] = 1;

        for(int neighbour: graph.get(node)){
            if(visited[neighbour] == 1){
                return true;
            }

            if (visited[neighbour] == 0){
                if(hasCycle(graph,visited,neighbour)) {
                    return true;
                }
            }
        }
        visited[node] = 2;
        return false;
    }
}

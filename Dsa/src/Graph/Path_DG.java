package Graph;

import java.util.ArrayList;
import java.util.List;

public class Path_DG {

    public static void main(String[] args) {
        int A = 5;
//        int[][] B = {
//                {1, 2},
//                {4, 1},
//                {2, 4},
//                {3, 4},
//                {5, 2},
//                {1, 3}
        int[][] B = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}};
        System.out.println(pathDG(A,B));
    }

    private static int pathDG(int A, int[][] B) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<=A;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edges: B){
           graph.get(edges[0]).add(edges[1]);
        }

        boolean[] visited = new boolean[A+1];

        return dfs(1,A,graph,visited)?1:0;
    }

    static boolean dfs(int node, int target, List<List<Integer>> graph, boolean[] visited) {
        if(node == target) return true;

        visited[node] = true;

        for(int neighbour: graph.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour,target,graph,visited)){
                    return true;
                }
            }
        }

        return false;
    }
}

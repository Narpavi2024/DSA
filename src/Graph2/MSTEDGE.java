package Graph2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MSTEDGE {

    static class DSU{
        int[] parent;
        DSU(int n){
            parent = new int[n+1];
            for(int i=1;i<=n;i++){
                parent[i] = i;
            }
        }

        int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void Union(int x,int y){
            int px = find(x),py = find(y);
            if (px != py){
                parent[px] = py;
            }
        }
    }

    public static void main(String[] args) {
        int A = 3;
        int[][] B = {
                {1, 2, 2},
                {1, 3, 2},
                {2, 3, 3}
        };

        System.out.println(Arrays.toString(edge(A,B)));
    }

    private static int[] edge(int A, int[][] B) {
        int M = B.length;
        int[] ans = new int[M];
        int[][] edges = new int[M][4];

        for(int i=0;i<M;i++){
            edges[i][0] = B[i][0];
            edges[i][1] = B[i][1];
            edges[i][2] = B[i][2];
            edges[i][3] = i;
        }

        Arrays.sort(edges,(a,b) -> Integer.compare(a[2],b[2]));

        DSU dsu = new DSU(A);

        int i=0;
        while (i < M){
            int j=i;
            while (j < M && edges[j][2] == edges[i][2]) j++;

            List<int[]> batch = new ArrayList<>();

            for(int k = i;k < j;k++){
                int u = edges[k][0],v = edges[k][1];
                int idx = edges[k][3];
                if(dsu.find(u) != dsu.find(v)){
                    ans[idx] = 1;
                    batch.add(edges[k]);
                }else{
                    ans[idx] = 0;
                }
            }

            for(int[] e:batch){
                dsu.Union(e[0],e[1]);
            }

            i = j;
        }
        return ans;
    }
}

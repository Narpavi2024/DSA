package Graph2;

public class Island {

    public static void main(String[] args) {
       int[][] A = {
               {0, 1, 0},
               {0, 0, 1},
               {1, 0, 0}
     };
        System.out.println(island(A));
    }

    private static int island(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(mat[i][j] == 1){
                    count++;
                    DFSisland(mat,i,j,N,M);
                }
            }
        }
        return count;
    }

    private static void DFSisland(int[][] mat, int sr, int sc, int n, int m) {
        mat[sr][sc] = 0;
        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        for(int d=0;d<8;d++){
            int nr = sr + dr[d];
            int nc = sc + dc[d];
            if(nr >=0 && nr<n && nc>=0 && nc<m && mat[nr][nc] == 1) {
                DFSisland(mat, nr, nc, n, m);
            }
        }
    }
}

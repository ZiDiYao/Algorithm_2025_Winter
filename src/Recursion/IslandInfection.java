package Recursion;
public class IslandInfection {
    // edge case
    public int countIsland(int[][] m){
        if(m == null|| m[0] == null){
            return 0;
        }
        int N = m.length;
        int M = m[0].length;
        int res =0;
        for (int i =0; i< N; i++){
            for (int j =0; j<M; j++){
                if (m[i][j] ==1){
                    res++;
                    infect(m,i,j,N,M);
                }
            }
        }
        return res;
    }

    private void infect(int[][] m, int i, int j, int N, int M){
        // base case
        if (i<0 || i>=N ||j<0 || j>=M|| m[i][j] !=1){
            return;
        }
        // i, j 没有越界
        m[i][j] =2;
        infect(m, i+1,j,N,M);
        infect(m, i-1,j,N,M);
        infect(m, i,j+1,N,M);
        infect(m, i,j-1,N,M);
    }
}

package Recursion;

public class IslandInfection {
    public int countIsland(int[][] m){
        if()


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

package DP;

public class UniquePath {

    public int uniquePaths(int m, int n) {
        // edge case
        if (m ==1 && n ==1){
            return 1;
        }

        // initilize a new 2D array
        int[][] record = new int[m][n];
        // put some initial value
        record[0][0] = 0;
        // record[1][0] = 1; // down
        // record[0][1] = 1; // right
        // record[1][1] = the sum of record[1-1][1] and record[1][1-1]
        // iterate through the 2D array
        for (int i=1; i<n;i++){
            record[0][i] = 1;
        }
        for (int i=1; i<m;i++){
            record[i][0] = 1;
        }
        for (int i =1; i< m; i++){
            for (int j=1; j<n;j++){
                int cur = record[i][j];
                int uperNode = record[i-1][j];
                int lefterNode = record[i][j-1];
                int sum = uperNode + lefterNode;
                record[i][j] = sum;
            }
        }
        return record[m-1][n-1];
    }
}

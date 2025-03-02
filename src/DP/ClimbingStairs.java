package DP;

public class ClimbingStairs {
    public int climbStairs(int n) {
        // initialize a list
        int[] list = new int[n+1];

        // intial state
        // 重点: 后面一个状态和前一个状态的推倒
        // 4 比 3 多一个 1   : 1
        // 4 比 2 多 两个1 或者 一个 2   : 11 || 2
        // 4 比 1 多 111 || 12 || 21 ||
        // edge case
        // < m when m = 4 : 1 2 3 4
        if (n == 1){
            return 1;

        }
        if (n == 2){
            return 2;

        }
        list[0] = 0;
        list[1] = 1;
        list[2] = 2;
        for (int i =3; i< list.length; i++ ){
            int pre = list[i-1];
            int prePre = list[i-2];
            list[i] = pre + prePre;
        }
        return list[list.length-1];

    }
}

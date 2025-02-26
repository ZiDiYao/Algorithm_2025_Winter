package Logarithm_Validator;

public class NimGame {
    // 打表法
    // 先手和后手都可以选择 4^n 这种吃法, 比如 1 4 16
    // 0  1  2 3  4
    // 后 先 后 先 先
    private String winner01(int n){
        // base case
        if (n < 5){
            if (n == 0 || n ==2){
                return "后手";
            }
            else {
                return "先手";
            }
        }
        // 当 n >= 5
        int base =1 ;
        while (base <= n){
            if (winner01(n-base).equals("后手")){
                return "先手";
            }
            // 防止溢出
            if (base > n/4){
                break;
            }
            base *=4;
        }
        return "后手";
    }
}

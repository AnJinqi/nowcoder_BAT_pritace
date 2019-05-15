//本题考的是动态规划，关键就是构建dp矩阵。

import java.util.*;

public class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        // write code here
        int[][] dp = new int[n][aim+1];
        for(int i = 0;i < n;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i < aim+1;i++){
            if(i % penny[0] == 0){
                dp[0][i] = 1;
            }
        }
        for(int i = 1;i < n;i++){
            for(int j = 1;j < aim + 1;j++){
                for(int k = 0;k * penny[i] <= j;k++){
                    dp[i][j] += dp[i-1][j - k * penny[i]];
                }
            }
        }
        return dp[n-1][aim];
    }
}

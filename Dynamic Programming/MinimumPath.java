import java.util.*;

public class MinimumPath {
    public int getMin(int[][] map, int n, int m) {
        // write code here
        int[][] dp = new int[n][m];
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += map[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for(int i = 0;i < m;i++){
            sum += map[0][i];
            dp[0][i] = sum;
        }
        for(int i = 1;i < n;i++){
            for(int j = 1;j < m;j++){
                dp[i][j] = map[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
    }
}

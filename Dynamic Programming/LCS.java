import java.util.*;

public class LCS{
    public int findLCS(String A, int n, String B, int m) {
        // write code here
        int[][] dp = new int[n][m];
        for(int i = 0;i < n;i++){
            if(A.charAt(i) == B.charAt(0))
            {
                for(int j = i;j < n;j++){
                    dp[j][0] = 1;
                }
                break;
            }
        }
        for(int i = 1;i < m;i++){
            if(B.charAt(i)==A.charAt(0)){
                for(int j = i;j < m;j++){
                    dp[0][j] = 1;
                }
                break;
            }
        }
        int max = -1;
        for(int i=1;i < n;i++){
            for(int j=1;j < m;j++){
                max = dp[i-1][j] > dp[i][j-1]?dp[i-1][j]:dp[i][j-1];
                if(A.charAt(i) == B.charAt(j)){
                    max = max > (dp[i-1][j-1] + 1)?max:(dp[i-1][j-1] + 1);
                }
                dp[i][j] = max;
            }
        }
        return dp[n-1][m-1];
    }
}

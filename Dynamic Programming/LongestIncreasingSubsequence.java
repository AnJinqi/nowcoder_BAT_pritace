import java.util.*;
 
public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        // write code here
        if (A.length <= 0 || n <= 0)
            return 0;
        int[] dp = new int[n];
        //处理边界。本题边界是第一个数A[0]
        dp[0] = 1;
        //求dp[i]的值；如何选择倒数第二个数？所有比A[i]小的数中，
        //选择以某个数A[x]结尾的dp[x]最大的数，做倒数第二个数；
        for (int i = 1; i < dp.length; i++) {
            //所有前面比A[i]小的数中，选择以某个数A[x]结尾的dp[x]最大的数，做倒数第二个数；
            int max = -1;
            for(int j = 0; j < i; j++){
                if(A[i] > A[j] && dp[j] > max)
                    max = dp[j];
            }
            if (max == -1)
                dp[i] = 1;
            else
                dp[i] = max + 1;
        }
        int res = -1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > res)
                res = dp[i];
        }
        return res;
    }
}

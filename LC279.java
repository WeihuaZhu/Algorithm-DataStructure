class LC279 {
    public int numSquares(int n) {
        if (n <= 0)
            return -1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i<=n; i++) {
            int big = (int)Math.sqrt(i);
            if (big*big == i) {
                dp[i] = 1;
            } else {
                int tempmin = i;
                for (int j = 1; j<=big; j++) {
                    tempmin = Math.min(tempmin, dp[i] = dp[i-j*j] + 1);
                    
                }
                dp[i] = tempmin;
                
            }
        }
        return dp[n];
        
    }
}
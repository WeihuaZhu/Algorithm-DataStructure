class LC650 {
    public int minSteps(int n) {
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        if (n == 2)
            return 2;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = i;
            for (int j=i/2; j>=2; j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + i/j;
                    break;
                }
            }
                        
        }
        
        
        
        
        return dp[n];
        
    }
}
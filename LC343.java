class LC236 {
    public int integerBreak1(int n) { //dp
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i<=n; i++) {
            int tempmax = 1;
            for (int j = 1; j <= i/2; j++) {
                tempmax = Math.max(dp[i-j]*dp[j], tempmax);
                tempmax = Math.max(tempmax, (i-j)*j);
                tempmax = Math.max(tempmax, dp[i-j]*j);
                tempmax = Math.max(tempmax, (i-j)*dp[j]);
                
            }
            dp[i] = tempmax;
        }
        return dp[n];   
    }


    public int integerBreak2(int n) { //math mean value inequality
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int tempmax = n-1;
        int i = 2;
        while (n / i > 1) {
            int rem = n % i;
            int num2 = rem;
            int num1 = i - num2;
            tempmax = Math.max(tempmax, (int)Math.pow(n / i, num1) * (int)Math.pow (n/i+1, num2));
            i++;
        }
        return tempmax;
        
    }

    public int integerBreak(int n) { //optimize
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n == 4)
            return 4;
        int num = n/3;
        int rem = n%3;
        if (rem == 0)
            return (int)Math.pow(3, num);
        else if (rem == 1)
            return (int)Math.pow(3, num-1)*4;
        else
            return (int)Math.pow(3, num)*2;
        
    }
}
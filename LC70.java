class LC70 {
    public int climbStairs(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int res = 0;
        int prevprev = 1;
        int prev = 2;
        for (int i = 3; i <= n; i++) {
            res = prevprev + prev;
            prevprev = prev;
            prev = res;
        }
        return res;
    }
}
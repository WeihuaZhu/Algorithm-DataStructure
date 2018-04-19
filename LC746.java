class LC746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0)
            return -1;
        if (cost.length == 1)
            return cost[0];
        if (cost.length == 2)
            return Math.min(cost[0], cost[1]);
        int res = 0;
        int prevprev = cost[0];
        int prev = cost[1];
        for (int i = 2; i < cost.length; i++) {
            res = Math.min(prevprev + cost[i], prev + cost[i]);
            prevprev = prev;
            prev = res;
            
        }
        return Math.min(prevprev, prev);
        
    }
}
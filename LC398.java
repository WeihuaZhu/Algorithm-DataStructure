class LC398 {
    private int[] data;
    private Random rad;
    
    public Solution(int[] nums) {
        data = nums;
        rad = new Random();
        
    }
    
    public int pick(int target) {
        int count = 1;
        int res = 0;
        for (int i=0; i<data.length; i++) {
            if (data[i] == target) {
                if (rad.nextInt(count) == 0)
                    res = i;
                count++;
            }            
            
            
        }
        return res;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
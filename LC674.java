class LC674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = 1;
        if (nums.length == 1)
            return res;
        int count = 1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i+1] > nums[i]) {            
                count++;
            } else {
                if (count > res)
                    res = count;
                count = 1;
            }       
        }
        if (count > res)
            res = count;
        return res;
        
        
        
    }
}
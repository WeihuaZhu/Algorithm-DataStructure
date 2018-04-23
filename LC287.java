class LC287 {
    public int findDuplicate(int[] nums) {
        int p1 = nums[0];
        int p2 = nums[0];
        do {
            p1 = nums[p1];
            p2 = nums[nums[p2]];
            
        } while(p1 != p2);
        
        p2 = nums[0];
        while (p1 != p2) {
            p1 = nums[p1];
            p2 = nums[p2];
        }
        return p1;
        
    }
} 
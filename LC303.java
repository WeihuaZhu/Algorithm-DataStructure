class LC303 {
    int[] prefix_sum;
    public NumArray(int[] nums) {
        if (nums!=null && nums.length!=0) {
            prefix_sum = new int[nums.length];
            prefix_sum[0] = nums[0];
            for (int i=1; i<nums.length; i++) {
                prefix_sum[i] = nums[i] + prefix_sum[i-1];
            }
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0)
            return prefix_sum[j];
        else
            return prefix_sum[j] - prefix_sum[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
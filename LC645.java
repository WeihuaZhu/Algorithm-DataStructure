class LC645 {
    public int[] findErrorNums(int[] nums) { //use HashSet
        int[] res = new int[2];
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int item: nums) {
            if (set.contains(item))
                res[0] = item;
            else
                set.add(item);
        }
        for (int i=1; i<=n; i++)
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        
       
        return res;
        
    }
}
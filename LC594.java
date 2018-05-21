class LC594 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num: nums)
            count.put(num, count.getOrDefault(num, 0) + 1);
        int res = 0;
        for (int item: count.keySet()) {
            int temp = count.get(item);
            int temp1 = count.getOrDefault(item-1, 0);
            int temp2 = count.getOrDefault(item+1, 0);
            if (temp1 == 0 && temp2 == 0)
                temp = 0;
            else {
                temp += Math.max(temp1,temp2);
            }
            if (temp > res)
                res = temp;
            
        }
        return res;
        
    }
}
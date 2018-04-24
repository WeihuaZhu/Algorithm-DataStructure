import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


class LC697 {
    //self writing 1st find degree 2nd two pointers
    public int findShortestSubArray(int[] nums) { 
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int item: nums) {
            memo.put(item, memo.getOrDefault(item, 0)+1);
        }
 
        
        int degree = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int num: memo.keySet()){
            if (memo.get(num)>degree) {
                degree = memo.get(num);
                res.clear();
                res.add(num);
            }
            else if (memo.get(num) == degree) {
                res.add(num);
            }
            else
                continue;
        }
     
        // two pointer find range
        int reslen = nums.length;
        for (int data: res) {
            int i = 0;
            int j = nums.length-1;
            while (nums[i] != data)
                i++;
            while (nums[j] != data)
                j--;
            reslen = Math.min(reslen, j-i+1);            
            
        }
        return reslen;
        
    }
    // optimized
    public int findShortestSubArray2(int[] nums) {
        HashMap<Integer, Integer[]> memo = new HashMap<>();
        int degree = 0;
        int len = nums.length;
        for (int i=0; i<nums.length; i++) {
            Integer[] data = memo.get(nums[i]);
            if (data == null) {
                data = new Integer[]{1, i};
            } else {
                data[0]++;
            }
            if (data[0]>degree) {
                degree = data[0];
                len = i - data[1] + 1;
            } else if (data[0] == degree) {
                len = Math.min(len, i-data[1]+1);
            } 
            memo.put(nums[i], data); 
        }
        return len;
        
    }
    // follow up find their unions
    public int findShortestSubArrayfollowup(int[] nums) { 
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int item: nums) {
            memo.put(item, memo.getOrDefault(item, 0)+1);
        }
 
        
        int degree = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int num: memo.keySet()){
            if (memo.get(num)>degree) {
                degree = memo.get(num);
                res.clear();
                res.add(num);
            }
            else if (memo.get(num) == degree) {
                res.add(num);
            }
            else
                continue;
        }
     
        // two pointer find range
        int reslen = nums.length;
        int start = nums.length-1;
        int end = 0;
        for (int data: res) {
            int i = 0;
            int j = nums.length-1;
            while (nums[i] != data)
                i++;
            while (nums[j] != data)
                j--;
            start = Math.min(start, i);
            end = Math.max(end, j);
            reslen = end - start + 1;            
            
        }
        return reslen;
        
    }

    public static void main(String[] args) {
        int[] test = {1,2,2,1,1,7,0,8,9,2,3,4,5,5};
        LC697 p = new LC697();
        System.out.println(p.findShortestSubArrayfollowup(test));
    }


}
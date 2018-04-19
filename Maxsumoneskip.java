public class Maxsumoneskip {
    public int maxskip(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<nums.length; i++) {    // odd case
            if(i%2==0)
                sum1=sum1+nums[i];
            else if (nums[i]>0)
                sum1=sum1+nums[i];

        }

        for (int i=0; i<nums.length; i++) {    // odd case
            if(i%2==1)
                sum2=sum2+nums[i];
            else if (nums[i]>0)
                sum2=sum2+nums[i];

        }

        return Math.max(sum1,sum2);

    }

    public static void main(String[] args) {
        int[] nums = {9,-1,-3,4,5};
        Maxsumoneskip p = new Maxsumoneskip();
        System.out.println(p.maxskip(nums));
    }

}

class Solution {
public int rob(int[] nums) {
        int sum[] = new int[nums.length];
        int prevMax = 0;
        if (nums.length > 2) {
            sum[0] = nums[0];
            sum[1] = nums[1];
            prevMax=sum[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            sum[i] = Math.max(prevMax + nums[i], sum[i - 1]);
            prevMax = Math.max(prevMax, sum[i - 1]);
        }
        return sum[sum.length-1];
    }


}
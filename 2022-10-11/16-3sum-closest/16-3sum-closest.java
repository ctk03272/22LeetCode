import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length && diff!=0; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start<end){
                int sum = nums[start] + nums[i] + nums[end];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return target - diff;
    }
}
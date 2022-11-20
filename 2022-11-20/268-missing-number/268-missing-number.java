class Solution {
    public int missingNumber(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int now=nums[index];
            if (now<=0 || now>nums.length || now==index+1 || now==nums[now-1]){
                index++;
            }else {
                swapIndex(nums,index,now-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return 0;
    }

    public void swapIndex(int[] nums, int from, int to) {
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int half = sum / 2;
        boolean makeSum[][] = new boolean[half + 1][nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            makeSum[0][i] = true;
        }

        for (int i = 1; i <= half; i++) {
            makeSum[i][0] = false;
        }


        for (int i = 1; i <= half; i++) {
            for (int j = 1; j <= nums.length; j++) {
                makeSum[i][j] = makeSum[i][j - 1];
                if (i >= nums[j-1]) {
                    makeSum[i][j] = makeSum[i][j] || makeSum[i - nums[j-1]][j - 1];
                }
            }
        }
        return makeSum[half][nums.length];
    }
}
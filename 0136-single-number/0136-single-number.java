class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for (int now:nums) {
            ans^=now;
        }
        return ans;
    }
}
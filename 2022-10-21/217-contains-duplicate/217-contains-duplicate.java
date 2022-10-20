class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!integers.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
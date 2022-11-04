class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int now = nums[i];
            if (now<=first){
                first=now;
            }else if(now<=second){
                second=now;
            }else {
                return true;
            }
        }
        return false;
    }

}
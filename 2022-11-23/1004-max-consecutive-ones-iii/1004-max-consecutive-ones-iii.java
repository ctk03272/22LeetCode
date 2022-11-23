class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        Deque<Integer> ks = new ArrayDeque<>();
        while (end < nums.length) {
            if (nums[end] == 0) {
                if (k == 0) {
                    if (ks.size() == 0) {
                        start = -1;
                    } else {
                        start = ks.pollFirst() + 1;
                        ks.add(end);
                    }
                } else {
                    k--;
                    ks.add(end);
                }
            } else {
                if (start == -1) {
                    start = end;
                }
            }
            if (start != -1) {
                ans = Math.max(ans, end - start + 1);
            }
            end++;
        }
        return ans;
    }
}
class Solution {
   public int findPoisonedDuration(int[] timeSeries, int duration) {
        int last = 0;
        int ans = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            int now = timeSeries[i];
            if (last <= now) {
                ans += duration;
            } else {
                ans += now + duration - last;
            }
            last=now+duration;
        }

        return ans;
    }
}
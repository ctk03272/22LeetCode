class Solution {
    public int countVowelStrings(int n) {
        int dp[] = new int[5];
        Arrays.fill(dp, 1);
        while (n > 1) {
            for (int i = 4; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    dp[i] += dp[j];
                }
            }
            n--;
        }
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            ans += dp[i];
        }
        return ans;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> strings = new HashSet<>();
        int back = 0;
        for (int i = 0; i < s.length(); i++) {
            Character now = s.charAt(i);
            if (!strings.contains(now)) {
                strings.add(now);
            } else {
                Character backChar;
                do {
                    backChar = s.charAt(back);
                    strings.remove(backChar);
                    back++;
                }while (backChar!=now);
                strings.add(now);
            }
            ans = Math.max(ans, strings.size());
        }

        return ans;
    }

}
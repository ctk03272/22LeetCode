class Solution {
    public boolean rotateString(String s, String goal) {
        int length = s.length();
        int count = 0;
        while (count < length) {
            char temp = s.charAt(0);
            s = s.substring(1, s.length()) + temp;
            if (s.equals(goal)) {
                return true;
            }
            count++;
        }
        return false;
    }
}
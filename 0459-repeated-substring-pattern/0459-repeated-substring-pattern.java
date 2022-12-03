class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        int mid = size / 2;
        for (int i = mid; i >= 1; i--) {
            int repeat = size / i;
            if (size % i == 0 && repeat!=1 && s.equals(s.substring(0,i).repeat(repeat))) {
                return true;
            }
        }
        return false;
    }
}
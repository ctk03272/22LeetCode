class Solution {
  public boolean rotateString(String s, String goal) {
        String doubleS = s.concat(s);
        return s.length()==goal.length() && doubleS.contains(goal);
    }
}
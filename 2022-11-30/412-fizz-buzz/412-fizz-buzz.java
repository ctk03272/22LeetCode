class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int now = i + 1;
            if (now % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (now % 5 == 0) {
                ans.add("Buzz");
            } else if (now % 3 == 0) {
                ans.add("Fizz");
            } else {
                ans.add(String.valueOf(now));
            }
        }
        return ans;
    }
}
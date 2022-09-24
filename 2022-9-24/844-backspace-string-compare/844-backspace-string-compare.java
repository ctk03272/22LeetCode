class Solution {
    public boolean backspaceCompare(String s, String t) {
        return makeCharacter(s).equals(makeCharacter(t));
    }

    public String makeCharacter(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (stack.isEmpty()) {
                if (now != '#') stack.push(now);
                continue;
            }
            if (now == '#') {
                stack.pop();
            } else {
                stack.push(now);
            }
        }

        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
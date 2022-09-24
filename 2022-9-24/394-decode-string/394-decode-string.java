class Solution {
    public String decodeString(String s) {
        String answer = "";
        int i = 0;
        while (i < s.length()) {
            char now = s.charAt(i);
            if (isInteger(now)) {
                int rptNum = getNumber(s.substring(i));
                String rptString = getString(s.substring(i + String.valueOf(rptNum).length()));
                answer+=decodeString(rptString).repeat(rptNum);
                i+=rptString.length()+String.valueOf(rptNum).length()+2;
            } else {
                answer += now;
                i++;
            }
        }
        return answer;
    }

    private String getString(String s) {
        Stack<Integer> stack = new Stack();
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (now == '[') {
                stack.push(i);
            } else if (now == ']') {
                int temp = stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    break;
                }
            }
        }
        return s.substring(start + 1, end);
    }

    private boolean isInteger(char ch) {
        return ch - '0' >= 0 && ch - '0' <= 9;
    }

    private int getNumber(String s) {
        int i = 0;
        while (i < s.length()) {
            if (isInteger(s.charAt(i))) {
                i++;
            } else {
                break;
            }
        }
        return Integer.valueOf(s.substring(0, i));
    }
}
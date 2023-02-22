class Solution {
	public String addStrings(String num1, String num2) {
		int carry = 0;
		int max = Math.max(num1.length(), num2.length());
		if (num1.length() > num2.length()) {
			num2 = "0".repeat(num1.length() - num2.length()) + num2;
		} else {
			num1 = "0".repeat(num2.length() - num1.length()) + num1;
		}
		String answer = "";
		for (int i = max - 1; i >= 0; i--) {
			int now = carry + (num1.charAt(i) - '0') + (num2.charAt(i) - '0');
			if (now >= 10) {
				carry = 1;
				now = now - 10;
			} else {
				carry = 0;
			}
			answer = now + answer;
		}
		if (carry == 1) {
			answer = carry + answer;
		}
		return answer;
	}
}
class Solution {
	public int compress(char[] chars) {
		int start = 0;
		int end = 0;
		int point = 0;
		int ans = 0;
		while (end <= chars.length && start<chars.length) {
			if (end!=chars.length &&chars[start] == chars[end]) {
				end++;
			} else {
				if (end - start == 1) {
					chars[point++] = chars[start];
					ans++;
				} else {
					chars[point++] = chars[start];
					String diff = String.valueOf(end - start);
					for (int i = 0; i < diff.length(); i++) {
						chars[point++] = diff.charAt(i);
					}
					ans += 1 + diff.length();
				}
				start = end;
			}
		}
		return ans;
	}
}
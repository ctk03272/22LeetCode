class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> ans = new ArrayList<>();

		for (int i = left; i <= right; i++) {
			int now = i;
			boolean divided=true;
			while (now != 0) {
				int d = now % 10;
				if (d == 0 || i % d != 0) {
					divided=false;
					break;
				}
				now = now / 10;
			}
			if (divided) {
				ans.add(i);
			}
		}
		return ans;
	}
}


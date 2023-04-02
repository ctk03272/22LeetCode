class Solution {
	private int bSearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < key) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

	public int[] successfulPairs(int[] spells, int[] potions, long success) {
		int n = spells.length;
		int m = potions.length;
		Arrays.sort(potions);
		int[] answer = new int[n];

		for (int i = 0; i < spells.length; i++) {
			int nowSpell = spells[i];
			int index = bSearch(potions, (int) Math.ceil((double)success/spells[i]));
			answer[i] = m - index;
		}
		return answer;
	}
}
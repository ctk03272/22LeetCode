class Solution {
	public int subarraySum(int[] nums, int k) {
		int sum = 0;
		int ans = 0;
		Map<Integer, Integer> integerIntegerMap = new HashMap<>();
		integerIntegerMap.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (integerIntegerMap.containsKey(sum - k)) {
				ans += integerIntegerMap.get(sum - k);
			}
			integerIntegerMap.put(sum, integerIntegerMap.getOrDefault(sum, 0) + 1);
		}
		return ans;
	}
}
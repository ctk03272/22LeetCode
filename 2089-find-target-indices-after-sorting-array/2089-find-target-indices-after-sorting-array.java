class Solution {
	public List<Integer> targetIndices(int[] nums, int target) {
		AtomicInteger index = new AtomicInteger();
		return Arrays.stream(nums)
			.sorted()
			.mapToObj(a -> new IndexValue(a, index.getAndIncrement()))
			.filter(a -> a.value == target)
			.map(a -> a.index)
			.collect(
				Collectors.toList());
	}

	class IndexValue {
		int value;
		int index;

		public IndexValue(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
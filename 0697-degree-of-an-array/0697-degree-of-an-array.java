class Solution {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Index> integerIndexMap = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int now = nums[i];
			if (!integerIndexMap.containsKey(now)) {
				Index index = new Index(i, i, 1);
				integerIndexMap.put(now, index);
			} else {
				Index nowIndex = integerIndexMap.get(now);
				nowIndex.end = i;
				nowIndex.count++;
			}
		}
		for (Index now : integerIndexMap.values()) {
			if (now.count>max){
				ans=now.end- now.start+1;
				max=now.count;
			}else if (now.count==max){
				ans=Math.min(ans,now.end-now.start+1);
			}
		}
		return ans;
	}
}

class Index {
	int start;
	int end;
	int count;

	public Index(int start, int end, int count) {
		this.start = start;
		this.end = end;
		this.count = count;
	}

	public Index() {
	}
}
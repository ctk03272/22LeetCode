public class Solution {
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> (b.get(0) + b.get(1)) - (a.get(0) + a.get(1)));
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				List<Integer> cur = new ArrayList<>();
				cur.add(nums1[i]);
				cur.add(nums2[j]);
				if (pq.size() == k) {
					List<Integer> temp = pq.peek();
					if (temp.get(0) + temp.get(1) > cur.get(0) + cur.get(1)) {
						pq.poll();
						pq.offer(cur);
					} else
						break;
				} else
					pq.offer(cur);
			}
		}
		return pq.stream().limit(k).collect(Collectors.toList());
	}
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int now = nums[i];
            if (!map.containsKey(now)) {
                map.put(now, 0);
            }
            map.put(now, map.get(now)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> -o1.getValue().compareTo(o2.getValue()));
        map.entrySet().forEach(priorityQueue::add);
        int ans[] = new int[k];
        while (k>0){
            ans[ans.length-k]=priorityQueue.poll().getKey();
            k--;
        }
        return ans;
    }

}
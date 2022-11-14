class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> -o1.compareTo(o2));
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        while (k>0){
            k--;
            ans=priorityQueue.poll();
        }
        return ans;
    }

}
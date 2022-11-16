class Solution {
    private PriorityQueue<Long> maxHeap;
    private PriorityQueue<Long> minHeap;

    public double[] medianSlidingWindow(int[] nums, int k) {
        double ans[] = new double[nums.length - k + 1];
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            addNum(nums[i]);
        }
        int start = 0;
        int end = k - 1;
        while (end < nums.length - 1) {
            ans[start] = findMedian();
            end++;
            addNum(nums[end]);
            removeNum(nums[start]);
            start++;
        }
        ans[start] = findMedian();
        return ans;
    }

    public void removeNum(int num) {
        if (maxHeap.remove((long) num)) {
            if (maxHeap.size() + 1 == minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

        } else if (minHeap.remove((long) num)) {
            if (maxHeap.size() - 2 == minHeap.size()) {
                minHeap.add(maxHeap.poll());
            }
        }
    }
    public void addNum(int num) {
        maxHeap.add((long) num);
        minHeap.add(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            if (maxHeap.size() < minHeap.size()) {
                return minHeap.peek();
            } else {
                return maxHeap.peek();
            }
        }
    }
}
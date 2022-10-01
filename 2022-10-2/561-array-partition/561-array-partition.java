class Solution {
    public int arrayPairSum(int[] nums) {

        PriorityQueue<Integer> priorityQueue = Arrays.stream(nums).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        int answer=0;
        while (!priorityQueue.isEmpty()){
            answer+=priorityQueue.poll();
            priorityQueue.poll();
        }
        return answer;
    }
}
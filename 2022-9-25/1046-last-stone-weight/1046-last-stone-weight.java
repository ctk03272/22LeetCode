class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueueLowest = Arrays.stream(stones).boxed().collect(Collectors.toCollection(() -> new PriorityQueue<>(Collections.reverseOrder())));
        while (priorityQueueLowest.size() > 1) {
            int first=priorityQueueLowest.poll();
            int second=priorityQueueLowest.poll();
            if(!Objects.equals(first, second)){
                priorityQueueLowest.offer(Math.abs(first-second));
            }
        }
        return priorityQueueLowest.isEmpty() ? 0 : priorityQueueLowest.poll();
    }
}
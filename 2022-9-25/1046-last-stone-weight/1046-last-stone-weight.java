class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while (i<stones.length){
            priorityQueueLowest.offer(stones[i]);
            i++;
        }
        while (priorityQueueLowest.size() > 1) {
            int first = priorityQueueLowest.poll();
            int second = priorityQueueLowest.poll();
            if (!Objects.equals(first, second)) {
                priorityQueueLowest.offer(Math.abs(first - second));
            }
        }
        return priorityQueueLowest.isEmpty() ? 0 : priorityQueueLowest.poll();
    }
}
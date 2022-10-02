import java.util.*;

class Solution {
  int[] coolDownMap = new int[26];

    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (map.containsKey(tasks[i])) {
                map.put(tasks[i], map.get(tasks[i]) + 1);
            } else {
                map.put(tasks[i], 1);
            }
        }
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        priorityQueue.addAll(map.entrySet());
        int ans = 0;
        while (!priorityQueue.isEmpty()) {
            Set<Map.Entry<Character, Integer>> temp = new HashSet<>();
            while (!priorityQueue.isEmpty()) {
                Map.Entry<Character, Integer> now = priorityQueue.poll();
                if (coolDownMap[now.getKey() - 'A'] != 0) {
                    temp.add(now);
                } else {
                    if (now.getValue() > 1) {
                        now.setValue(now.getValue() - 1);
                        priorityQueue.add(now);
                    }
                    coolDownMap[now.getKey() - 'A'] = n+1;
                    break;
                }
            }
            priorityQueue.addAll(temp);
            goPeriod();
            ans++;
        }
        return ans;
    }

    public void goPeriod() {
        for (int i = 0; i < coolDownMap.length; i++) {
            if (coolDownMap[i] > 0) {
                coolDownMap[i]--;
            }
        }
    }
}
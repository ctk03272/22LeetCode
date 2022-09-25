class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> countMap = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String now = words[i];
            if (countMap.containsKey(now)) {
                countMap.put(now, countMap.get(now) + 1);
            } else {
                countMap.put(now, 1);
            }
        }

        PriorityQueue<String> stringPq = new PriorityQueue<>((o1, o2) -> {
            int o1Count=countMap.get(o1);
            int o2Count=countMap.get(o2);

            if(o1Count==o2Count){
                return o1.compareTo(o2);
            }else{
                return o2Count-o1Count;
            }
        });

        for (String key : countMap.keySet()) {
            stringPq.offer(key);
        }
        while (k>0){
            answer.add(stringPq.poll());
            k--;
        }

        return answer;
    }
}
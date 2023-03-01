class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int ans = 0;
        int len = profits.length;
        List<Project> projects = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            projects.add(new Project(capital[i], profits[i]));
        }
        Collections.sort(projects, (o1, o2) -> o1.capital - o2.capital);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;
        for (int i = 0; i < k; i++) {
            while (index < len && projects.get(index).capital <= w) {
                pq.add(projects.get(index++).profit);
            }
            if (pq.isEmpty()) {
                break;
            }
            w += pq.poll();
        }
        return w;
    }

    class Project {
        int capital;
        int profit;

        public Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }

}
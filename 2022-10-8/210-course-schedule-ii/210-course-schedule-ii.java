class Solution {
    int[] ans;
    int index=0;
    int[] cnt;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ans = new int[numCourses];
        cnt = new int[numCourses];
        Arrays.fill(ans, -1);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int from = prerequisites[i][1];
            int to = prerequisites[i][0];
            graph.get(from).add(to);
            cnt[to]++;
        }
        topologicalSort(graph);

        if(ans[ans.length-1]==-1){
            return new int[]{};
        }
        return ans;
    }

    void topologicalSort(List<List<Integer>> graph) {
        Queue<Integer> integers = new LinkedList<>();

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) {
                integers.add(i);
            }
        }

        while (!integers.isEmpty()) {
            int now = integers.poll();
            ans[index++]=now;
            for (int next : graph.get(now)) {
                cnt[next]--;
                if (cnt[next] == 0) {
                    integers.add(next);
                }
            }
        }
    }
}
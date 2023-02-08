class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]> adjList = new ArrayList<>(n + 1);
        int distList[] = new int[n + 1];
        Arrays.fill(distList, Integer.MAX_VALUE);
        distList[0]=0;
        for (int i = 0; i < n + 1; i++) {
            int[] init = new int[n + 1];
            Arrays.fill(init, -1);
            adjList.add(init);
        }
        for (int i = 0; i < times.length; i++) {
            int source = times[i][0];
            int dest = times[i][1];
            int takeTime = times[i][2];
            adjList.get(source)[dest] = takeTime;
        }

        Queue<Node> pq = new PriorityQueue<Node>(Comparator.comparingInt(o -> o.node));
        pq.add(new Node(k, 0));
        distList[k]=0;
        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int node = now.node;
            int dist = now.dist;
            int[] adj = adjList.get(node);
            for (int i = 0; i < adj.length; i++) {
                if (adj[i] != -1) {
                    int target=i;
                    if(distList[target]>dist+adj[i]){
                        distList[target]=dist+adj[i];
                        pq.add(new Node(target,dist+adj[i]));
                    }
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i : distList) {
            if (i!=Integer.MAX_VALUE && i!=0){
                ans = Math.max(ans, i);
            }
            if(i==Integer.MAX_VALUE){
                return -1;
            }
        }
        return ans;
    }
}

class Node {
    int node;
    int dist;

    public Node(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge:edges){
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        Set<Integer> seen = new HashSet<>();
        seen.add(source);

        while (!q.isEmpty()){
            int cur = q.poll();
            if (cur == destination){
                return true;
            }
            for(int adjVert: graph.get(cur)){
                if (!seen.add(adjVert))
                    continue;
                q.offer(adjVert);
            }
        }
        return false;
    }
}
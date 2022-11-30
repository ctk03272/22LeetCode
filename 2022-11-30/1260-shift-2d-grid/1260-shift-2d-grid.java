class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                deque.add(grid[i][j]);
            }
        }
        while (k > 0) {
            deque.addFirst(deque.pollLast());
            k--;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                temp.add(deque.pollFirst());
            }
            ans.add(temp);
        }
        return ans;
    }
}
class Solution {
    int m;
    int n;
    int[] dx = new int[]{1, -1, 0, 0,};
    int[] dy = new int[]{0, 0, 1, -1};
    boolean[][][] visit;

    public int shortestPath(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        int ansValue = 0;
        visit = new boolean[m][n][k + 1];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, 0));
        visit[0][0][0] = true;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node now = queue.poll();
                int nowX = now.x;
                int nowY = now.y;
                int nowK = now.k;
                if (nowX == n - 1 && nowY == m - 1) {
                    return ansValue;
                }
                for (int j = 0; j < 4; j++) {
                    int nextX = nowX + dx[j];
                    int nextY = nowY + dy[j];
                    if (isInRange(nextX, nextY)) {
                        if (grid[nextY][nextX] == 0) {
                            if (!visit[nextY][nextX][nowK]) {
                                queue.add(new Node(nextX, nextY, nowK));
                                visit[nextY][nextX][nowK] = true;

                            }
                        } else if (grid[nextY][nextX] == 1 && nowK < k) {
                            if (!visit[nextY][nextX][nowK + 1]) {
                                queue.add(new Node(nextX, nextY, nowK + 1));
                                visit[nextY][nextX][nowK + 1] = true;
                            }
                        }
                    }
                }
            }
            ansValue++;
        }
        return -1;
    }

    private boolean isInRange(int x, int y) {
        if (0 <= x && x < n && 0 <= y && y < m) {
            return true;
        }
        return false;
    }

    class Node {
        int x;
        int y;
        int k;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Node(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.k = k;
        }
    }
}
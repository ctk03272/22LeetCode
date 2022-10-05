import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        int dx[] = new int[]{1, -1, 0, 0};
        int dy[] = new int[]{0, 0, 1, -1};

        Queue<Node> nodes = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    nodes.add(new Node(j, i));
                }
            }
        }
        Set<Node> tempSet = new HashSet<>();

        while (!nodes.isEmpty()) {
            Node now = nodes.poll();
            for (int i = 0; i < 4; i++) {
                int nowX = now.x + dx[i];
                int nowY = now.y + dy[i];
                if (0 <= nowX && nowX < n && 0 <= nowY && nowY < m) {
                    if (grid[nowY][nowX] == 1) {
                        grid[nowY][nowX] = 2;
                        tempSet.add(new Node(nowX, nowY));
                    }
                }
            }
            if (nodes.isEmpty()) {
                if (!tempSet.isEmpty()) {
                    ans++;
                    nodes.addAll(tempSet);
                    tempSet.clear();
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return ans;
    }
}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
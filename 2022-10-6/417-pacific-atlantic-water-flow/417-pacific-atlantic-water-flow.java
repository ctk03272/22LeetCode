import java.util.*;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int dx[] = new int[]{1, -1, 0, 0};
        int dy[] = new int[]{0, 0, 1, -1};

        boolean isPacific[][] = new boolean[m][n];
        boolean isAtlantic[][] = new boolean[m][n];

        boolean isVisited[][] = new boolean[m][n];

        Queue<Node> nodes = new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    nodes.add(new Node(j, i));
                    isPacific[i][j] = true;
                    isVisited[i][j] = true;
                }
            }
        }

        while (!nodes.isEmpty()) {
            Node now = nodes.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = now.x + dx[i];
                int nowY = now.y + dy[i];
                if (0 <= nowX && nowX < n && 0 <= nowY && nowY < m && heights[now.y][now.x] <= heights[nowY][nowX] && !isVisited[nowY][nowX]) {
                    isPacific[nowY][nowX] = true;
                    isVisited[nowY][nowX] = true;
                    nodes.add(new Node(nowX, nowY));
                }
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==m -1|| j==n-1){
                    nodes.add(new Node(j,i));
                    isAtlantic[i][j] = true;
                    isVisited[i][j] = true;
                }
            }
        }

        isVisited=new boolean[m][n];


        while (!nodes.isEmpty()) {
            Node now = nodes.poll();

            for (int i = 0; i < 4; i++) {
                int nowX = now.x + dx[i];
                int nowY = now.y + dy[i];
                if (0 <= nowX && nowX < n && 0 <= nowY && nowY < m && heights[now.y][now.x] <= heights[nowY][nowX] && !isVisited[nowY][nowX]) {
                    isAtlantic[nowY][nowX] = true;
                    isVisited[nowY][nowX] = true;
                    nodes.add(new Node(nowX, nowY));
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isPacific[i][j] && isAtlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
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
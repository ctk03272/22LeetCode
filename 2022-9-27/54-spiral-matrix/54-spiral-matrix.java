class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> integers = new ArrayList<>();
        int dx[] = new int[]{1, 0, -1, 0};
        int dy[] = new int[]{0, 1, 0, -1};
        boolean visit[][] = new boolean[m][n];

        int i = 0, j = 0, k = 0;
        while (true) {
            if (i < 0 || i >= m || j < 0 || j > n || visit[i][j]) {
                break;
            }
            integers.add(matrix[i][j]);
            visit[i][j] = true;

            int nextI = i + dy[k];
            int nextJ = j + dx[k];
            if (nextI < m && nextI >= 0 && nextJ >= 0 && nextJ < n && !visit[nextI][nextJ]) {
                i = nextI;
                j = nextJ;
            } else {
                if (k == 3) {
                    k = 0;
                } else {
                    k++;
                }
                i = i + dy[k];
                j = j + dx[k];
            }
        }
        return integers;
    }
}
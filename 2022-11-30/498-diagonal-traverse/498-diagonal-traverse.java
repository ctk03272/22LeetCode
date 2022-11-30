class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        int direction = 0;
        int[] dx = {1, -1};
        int[] dy = {-1, 1};
        while (true) {
            ans.add(mat[j][i]);
            if (i == n - 1 && j == m - 1) {
                break;
            }
            if (inBorder(i + dx[direction], j + dy[direction], mat)) {
                i = i + dx[direction];
                j = j + dy[direction];
            } else {
                if (direction == 0) {
                    direction = 1;
                    if (i == n-1) {
                        j = j + 1;
                    } else {
                        i = i + 1;
                    }
                } else {
                    direction = 0;
                    if (j == m-1) {
                        i = i + 1;
                    } else {
                        j = j + 1;
                    }
                }
            }
        }
        int[] answer = new int[ans.size()];
        for (int k = 0; k < answer.length; k++) {
            answer[k] = ans.get(k);
        }
        return answer;
    }

    private boolean inBorder(int i, int j, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        return true;
    }
}

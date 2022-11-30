class Solution {
    public void gameOfLife(int[][] board) {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                int count = checkNeighbor(i, j, board);
                if (board[j][i] == 1) {
                    board[j][i] = 1 + count * 2;
                } else {
                    board[j][i] = count * 2;
                }
            }
        }

        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                if (board[j][i] == 5 || board[j][i] == 7) {
                    board[j][i] = 1;
                } else if (board[j][i] == 6) {
                    board[j][i] = 1;
                } else {
                    board[j][i] = 0;
                }
            }
        }
    }

    public int checkNeighbor(int i, int j, int[][] board) {
        int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
        int dy[] = {0, 1, -1, 1, -1, 0, 1, -1};
        int count = 0;
        for (int k = 0; k < dx.length; k++) {
            int nowX = i + dx[k];
            int nowY = j + dy[k];
            if (checkBorder(nowX, nowY, board)) {
                if (board[nowY][nowX] % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkBorder(int i, int j, int[][] board) {
        int m = board.length;
        int n = board[0].length;
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        return true;
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            matrix[i] = reverse(matrix[i]);
        }
    }

    private int[] reverse(int[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = temp;
        }
        return ar;
    }
}
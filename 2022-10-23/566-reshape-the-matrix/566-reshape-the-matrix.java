class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat[0].length;
        int n = mat.length;
        if (m * n != r * c) {
            return mat;
        }
        int[] list = Arrays.stream(mat).flatMapToInt(Arrays::stream).toArray();
        int[][] ans=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j]=list[i*c+j];
            }
        }
        return ans;
    }
}
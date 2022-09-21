class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val answer = MutableList(size = m) { MutableList(size = n) { 0 } }

        for (i in 0 until m) {
            for (j in 0 until n) {
                if(i==0 || j==0){
                    answer[i][j]=1
                }
                if (i - 1 in 0 until m && j - 1 in 0 until n) {
                    answer[i][j] = answer[i - 1][j] + answer[i][j - 1]
                }
            }
        }
        return answer[m - 1][n - 1]
    }
}
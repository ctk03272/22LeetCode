class Solution {
   fun numIslands(grid: Array<CharArray>): Int {
        var answer = 0
        var m = grid.size
        var n = grid[0].size
        var visited: Array<BooleanArray> = Array(m) { BooleanArray(n) }
        fun checkIsland(i: Int, j: Int, count: Int): Unit {
            if ((i in (0 until m)) && (j in (0 until n)) && (grid[i][j] == '1') && !visited[i][j]) {
                visited[i][j] = true
                checkIsland(i + 1, j, count)
                checkIsland(i, j + 1, count)
                checkIsland(i - 1, j, count)
                checkIsland(i, j - 1, count)
            }
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] != '0' && !visited[i][j]) {
                    answer++
                    checkIsland(i, j, answer)
                }
            }
        }
        return answer
    }
}
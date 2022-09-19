class Solution {
    data class Pixel(val x: Int, val y: Int, val color: Int)
    companion object {
        val dx = intArrayOf(1, -1, 0, 0)
        val dy = intArrayOf(0, 0, 1, -1)
    }

    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        var n = image.size
        var m = image[0].size
        if (color == image[sr][sc]) {
            return image
        }
        var visited: Array<BooleanArray> = Array(n) { BooleanArray(m) }
        var que: Queue<Pixel> = LinkedList<Pixel>(listOf(Pixel(sc, sr, image[sr][sc])))
        image[sr][sc] = color

        while (!que.isEmpty()) {
            var now: Pixel = que.poll()
            for (i in dx.indices) {
                var x = now.x + dx[i]
                var y = now.y + dy[i]
                val nowColor = now.color
                if (x in 0 until m && y in 0 until n && !visited[y][x] && nowColor == image[y][x]) {
                    que.add(Pixel(x, y, image[y][x]))
                    image[y][x] = color
                    visited[y][x]=true
                }
            }
        }
        return image
    }
}

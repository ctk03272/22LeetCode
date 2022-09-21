class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var answer = MutableList(cost.size + 1) { 0 }
        answer[0] = 0
        answer[1] = 0

        for (i in 2..cost.size) {
            answer[i] = (answer[i - 2] + cost[i - 2]).coerceAtMost(answer[i - 1] + cost[i - 1])
        }
        return answer.last()
    }
}
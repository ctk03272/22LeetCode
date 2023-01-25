class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        var rankArray = score.mapIndexed { index, i -> Rank(i, index) }.sortedByDescending { rank: Rank -> rank.score }
        var ans = Array<String>(score.size){""}
        for (i in score.indices) {
            var temp = rankArray[i]
            if (i == 0) {
                ans[temp.index] = "Gold Medal"
            } else if (i == 1) {
                ans[temp.index] = "Silver Medal"
            } else if (i == 2) {
                ans[temp.index] = "Bronze Medal"
            } else {
                ans[temp.index] = (i+1).toString()
            }
        }
        return ans
    }
}

class Rank(score: Int, index: Int) {
    var score: Int
    var index: Int

    init {
        this.score = score
        this.index = index
    }
}
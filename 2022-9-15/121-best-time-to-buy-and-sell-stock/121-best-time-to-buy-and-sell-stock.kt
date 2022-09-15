class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit:Int=0
        var lowest:Int= Int.MAX_VALUE
        for (i in prices.indices){
            var now=prices[i]
            maxProfit= maxProfit.coerceAtLeast(now - lowest)
            lowest= lowest.coerceAtMost(now)
        }
        return maxProfit
    }
}
class Solution {
    fun arrangeCoins(n: Int): Int {
        return (Math.sqrt(2*n.toDouble()+0.25)-0.5).toInt()
    }
}
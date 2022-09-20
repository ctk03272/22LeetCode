class Solution {
    var memo=IntArray(46)
    fun climbStairs(n: Int): Int {
        memo[1]=1
        memo[2]=2
        for (i in 3..n){
            memo[i]=memo[i-1]+memo[i-2]
        }
        return memo[n]
    }
}

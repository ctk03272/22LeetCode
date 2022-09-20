class Solution {
    var memo = IntArray(31)
    fun fib(n: Int): Int {
        if (n == 0) {
            return 0
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            if (memo[n] != 0) {
                return memo[n]
            } else {
                memo[n] = fib(n - 1) + fib(n - 2)
                return memo[n]
            }
        }
    }
}
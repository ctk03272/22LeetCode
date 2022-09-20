class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n;

        var cur = 1
        var sum = 0
        var temp = 0;
        var count = 0
        while (n > count) {
            temp = cur;
            cur += sum;
            sum = temp;
            count++;
        }
        return sum
    }
}

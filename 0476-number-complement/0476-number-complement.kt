class Solution {
    fun findComplement(num: Int): Int {
        var sum = 0;
        while (sum < num) {
            sum = (sum shl 1) or 1;
        }
        return sum - num
    }
}
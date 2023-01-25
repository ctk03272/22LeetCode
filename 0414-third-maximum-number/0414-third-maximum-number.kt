class Solution {
    fun thirdMax(nums: IntArray): Int {
        var elminateDuplicate = nums.toSet().sortedDescending()
        if (elminateDuplicate.size == 1) {
            return elminateDuplicate[0]
        } else if (elminateDuplicate.size == 2) {
            return elminateDuplicate[0].coerceAtLeast(elminateDuplicate[1])
        } else {
            return nums.toSet().sortedDescending()[2]
        }
    }
}
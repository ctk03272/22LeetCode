class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        nums.forEach {
            if (i == 0 || it != nums[i - 1]) {
                nums[i++] = it
            }
        }
        return i
    }
}
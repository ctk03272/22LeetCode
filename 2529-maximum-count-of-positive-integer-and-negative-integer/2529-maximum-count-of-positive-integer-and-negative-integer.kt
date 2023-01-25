
class Solution {
    fun maximumCount(nums: IntArray): Int {
        return Math.max(bSearch(nums, 0), nums.size - bSearch(nums, 1))
    }

}

fun bSearch(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size
    while (start < end) {
        var mid = start + (end - start) / 2
        if (nums[mid] < target) {
            start = mid + 1
        } else {
            end = mid
        }
    }
    return start
}
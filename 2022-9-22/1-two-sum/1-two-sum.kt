class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                return intArrayOf(i, map.getValue(target - nums[i]))
            }
            map[nums[i]] = i
        }
        return IntArray(2)
    }
}
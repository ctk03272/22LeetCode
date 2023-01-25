class Solution {
    fun findLHS(nums: IntArray): Int {
        var map: HashMap<Int, Int> = HashMap();
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        var ans = 0
        for (key in map.keys) {
            if (map.containsKey(key + 1)) {
                ans = Math.max(ans, map[key + 1]!! + map[key]!!)
            }
        }
        return ans
    }
}
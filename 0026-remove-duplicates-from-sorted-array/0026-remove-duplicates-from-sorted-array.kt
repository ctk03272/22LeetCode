class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        nums.forEach {
            if (i==0){
                nums[i++]=it
            }
            if (it != nums[i - 1]) {
                nums[i++] = it
            }
        }
        return i
    }
}
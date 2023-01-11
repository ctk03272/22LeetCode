class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while(start < end){
            val mid = (start + end)/2
            if (nums[mid] >= target){
                end = mid   
            } else {
                start = mid + 1     
            }
        }
        return if(nums[start] >= target) start else start + 1
    }
}
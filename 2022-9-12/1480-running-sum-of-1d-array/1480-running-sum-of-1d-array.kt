class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for (i in nums.indices){
            if (i==0){
                continue
            }else{
                nums[i]=nums[i-1]+nums[i]
            }
        }
        return nums
    }
}
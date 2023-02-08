class Solution {
	public int findLengthOfLCIS(int[] nums) {
		if(nums.length<=1){
			return nums.length;	
		}
		int answer=1;
		int count=1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]<nums[i+1]){
				count++;
				answer=Math.max(answer,count);
			}
			else{
				count=1;
			}
		}
		return answer;
	}
}

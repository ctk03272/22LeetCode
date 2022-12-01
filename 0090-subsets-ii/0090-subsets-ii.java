class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        makeAnswerWithBacktracking(ans,new ArrayList<>(),0,nums.length,nums);
        return ans;
    }
    public void makeAnswerWithBacktracking(List<List<Integer>> ans,List<Integer> now,int index,int length,int[] nums){
        ans.add(new ArrayList<>(now));
        for (int i = index; i <length ; i++) {
            if (i!=index && nums[i]==nums[i-1]){
                continue;
            }
            now.add(nums[i]);
            makeAnswerWithBacktracking(ans,now,i+1,length,nums);
            now.remove(now.size()-1);
        }
    }
}
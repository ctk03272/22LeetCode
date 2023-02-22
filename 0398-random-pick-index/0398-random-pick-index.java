class Solution {
    Random r=new Random();
    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.get(nums[i]).add(i);
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
    }
    
    public int pick(int target) {
        return map.get(target).get(r.nextInt(map.get(target).size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
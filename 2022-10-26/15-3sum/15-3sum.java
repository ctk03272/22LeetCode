class Solution {    
 public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);

        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
                        if(nums[i]>0){
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                             if(sum>0){
                    continue;
                }
                if (map.containsKey(-sum) && map.get(-sum) > j) {
                    List<Integer> ar = new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[j]);
                    ar.add(-sum);
//                    if (!hasThisArray(answer, ar))
                    answer.add(ar);
                }
            }
        }
        return answer;
    }

}
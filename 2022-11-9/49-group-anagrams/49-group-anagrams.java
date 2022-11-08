class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String now=strs[i];
            char[] sorted=now.toCharArray();
            Arrays.sort(sorted);
            String sortStr=new String(sorted);
            if (!map.containsKey(sortStr)) {
                map.put(sortStr, new ArrayList<>());
            }
            map.get(sortStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

}
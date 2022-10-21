class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,-1);
            }else {
                map.put(ch,i);
            }
        }
        return map.values().stream().filter(integer -> integer!=-1).sorted().findFirst().orElse(-1);
    }
}
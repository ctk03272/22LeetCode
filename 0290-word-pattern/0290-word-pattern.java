class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String splitS[] = s.split(" ");
        if (splitS.length!=pattern.length()){
            return false;
        }
        for (int i = 0; i < splitS.length; i++) {
            String now=splitS[i];
            Character nowPatter=pattern.charAt(i);
            if(!map.containsKey(nowPatter) && !map.containsValue(now)){
                map.put(nowPatter,now);
            }else {
                if (!now.equals(map.get(nowPatter))){
                    return false;
                }
            }
        }
        return true;
    }
}
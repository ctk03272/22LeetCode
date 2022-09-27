class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        int index = 0;
        int shortestLength = Integer.MAX_VALUE;
        int length = strs.length;
        if(length==0){
            return sb.toString();
        }
        for (int i = 0; i < length; i++) {
            shortestLength = Math.min(shortestLength, strs[i].length());
        }
        while (true) {
            if (index == shortestLength) {
                break;
            }
            boolean isCommonPrefix = true;
            char firstCharacter = strs[0].charAt(index);
            for (int i = 1; i < length; i++) {
                if(firstCharacter!=strs[i].charAt(index)){
                    isCommonPrefix=false;
                    break;
                }
            }
            if(!isCommonPrefix){
                break;
            }
            sb.append(strs[0].charAt(index));
            index++;

        }
        return sb.toString(); 
    }
}
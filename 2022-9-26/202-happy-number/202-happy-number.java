class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> stringBooleanHashMap = new HashMap<>();
        while(!stringBooleanHashMap.containsKey(n)){
            if(n==1){
                return true;
            }
            stringBooleanHashMap.put(n,true);
            String stringN=String.valueOf(n);
            int m=0;
            for (int i = 0; i <stringN.length() ; i++) {
                int now=stringN.charAt(i)-'0';
                m+=now*now;
            }
            n=m;
        }
        return false;
    }
}
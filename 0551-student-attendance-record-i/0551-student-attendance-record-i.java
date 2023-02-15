class Solution {
	public boolean checkRecord(String s) {
		int absent=0;
		int consecutive = 0;
		for (int i = 0; i < s.length(); i++) {
			char now = s.charAt(i);
			if (now=='L'){
				consecutive++;
				if (consecutive==3){
					return false;
				}
			}else {
				consecutive=0;
			}
			if (now=='A'){
				absent++;
			}
		}
		if (absent>=2){
			return false;
		}
		return true;
	}
}
class Solution {
	public int titleToNumber(String columnTitle) {
		int result=0;
		int mult=0;
		for (int i = columnTitle.length()-1; i >=0; i--) {
			char now=columnTitle.charAt(i);
			result+=(now-'A'+1)* Math.pow(26,mult);
			mult++;
		}
		return result;
	}
}
class Solution {
	public void reverseString(char[] s) {
		int n = s.length / 2;
		for (int i = 0; i < n; i++) {
			char temp=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=temp;
		}
	}
}
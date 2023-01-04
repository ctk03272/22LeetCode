class Solution {
	public int trailingZeroes(int n) {
		int ans=0;
		int five=5;
		while (n>=five){
			ans+=n/five;
			five*=5;
		}
		return ans;
	}
}
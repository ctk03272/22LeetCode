class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
		int len = num.length - 1;
		while (len >= 0) {
			k += num[len];
			len--;
			res.add(k % 10);
			k /= 10;
		}
		while (k!=0){
			res.add(k%10);
			k/=10;
		}
		Collections.reverse(res);
		return res;
    }
}
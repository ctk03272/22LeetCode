class Solution {
    public int subtractProductAndSum(int n) {
        int ans1 = 1;
        int ans2 = 0;
        while(n != 0){
            int digit = n%10;
            n = n/10;
            ans1 *=digit;
            ans2 +=digit;
        }
        return ans1 - ans2;
    }
}
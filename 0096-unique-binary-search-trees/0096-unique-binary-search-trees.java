class Solution {
    public int numTrees(int n) {
        int[] ans=new int[n+1];
        ans[0]=1;
        ans[1]=1;
        for(int i=2;i<=n;i++){
            int temp=0;
            for(int j=0;j<i;j++){
                temp+=ans[j]*ans[i-j-1];
            }
            ans[i]=temp;
        }
        return ans[n];
    }
}

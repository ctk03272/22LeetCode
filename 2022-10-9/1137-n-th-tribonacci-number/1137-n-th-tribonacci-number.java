class Solution {
  public int tribonacci(int n) {
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = 1;
        sum[2] = 1;
        for (int i = 3; i <= n; i++) {
            sum[i]=sum[i-1]+sum[i-2]+sum[i-3];
        }
        return sum[n];
    }
}
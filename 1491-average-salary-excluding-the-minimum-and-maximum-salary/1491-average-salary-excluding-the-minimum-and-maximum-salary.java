class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<salary.length;i++){
            int now=salary[i];
            sum+=now;
            if(now<min){
                min=now;
            }
            if(now>max){
                max=now;
            }
        }
        return ((double)(sum-min-max))/(salary.length-2);
    }
}
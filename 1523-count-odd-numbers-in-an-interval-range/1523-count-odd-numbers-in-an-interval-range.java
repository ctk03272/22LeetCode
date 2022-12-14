class Solution {
    public int countOdds(int low, int high) {
        int range=(high-low+1);
        if((high-low+1)%2==0){
            return (high-low+1)/2;
        }else{
            if(high%2==0){
                return (high-low+1)/2;
            }else{
                return (high-low+1)/2+1;
            }
        }
    }
}
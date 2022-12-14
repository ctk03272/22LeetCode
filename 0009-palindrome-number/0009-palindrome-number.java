class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }else if(x==0){
            return true;
        }
        int halfLength = ((int) Math.log10(x) + 1) / 2;
        int index = 0;
        while (halfLength != 0) {
            int length = ((int) Math.log10(x) + 1);
            int first = (int) (x / (Math.pow(10, length - 1-index)));
            first = first % 10;
            int last = x % 10;
            if (first != last) {
                return false;
            }
            x = x / 10;
            index++;
            halfLength--;
        }
        return true;
    }
}
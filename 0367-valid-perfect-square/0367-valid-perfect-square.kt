
class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var start:Long=0
        var end:Long=num.toLong()
        while (start<=end){
            var mid:Long=(start+end)/2
            if(mid*mid<num){
                start=mid+1
            }else if(mid*mid==num.toLong()){
                return true
            }else{
                end=mid-1
            }
        }
        return false
    }
}
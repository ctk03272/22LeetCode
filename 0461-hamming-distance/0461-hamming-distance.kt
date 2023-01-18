class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var ans=0
        var calc=x xor y
        //
        while (calc>0){
            calc=calc and (calc-1)
            ans++
        }
        return ans
    }
}
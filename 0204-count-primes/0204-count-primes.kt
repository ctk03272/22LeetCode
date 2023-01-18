class Solution {
    fun countPrimes(n: Int): Int {
        var notPrime = Array(n){false}
        var ans=0

        for (i in 2 until n){
            if (!notPrime[i]){
                ans++
                var j=2;
                while (i*j<n){
                    notPrime[i*j]=true
                    j++

                }
            }
        }
        return ans
    }
}
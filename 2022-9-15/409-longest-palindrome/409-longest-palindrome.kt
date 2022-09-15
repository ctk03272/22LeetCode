class Solution {
    fun longestPalindrome(s: String): Int {
        var map = HashMap<Char, Int>();
        for (i in s.indices) {
            if (map.containsKey(s[i])) {
                var num = map[s[i]]
                if (num != null) {
                    map[s[i]] = num + 1
                }
            } else {
                map[s[i]] = 1
            }
        }
        var hasOdd = false
        var count = 0
        map.values.forEach() { it ->
            if (it % 2 != 0) {
                hasOdd = true
                count+=it-1
            }else{
                count+=it
            }
        }
        return if(hasOdd){
            count+1
        }else{
            count
        }
    }
}
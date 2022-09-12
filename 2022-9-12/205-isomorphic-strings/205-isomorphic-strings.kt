class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val hashMap1 = HashMap<Char, Char>()
        val hashMap2 = HashMap<Char, Char>()
        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]
            if (!hashMap1.containsKey(sChar) && !hashMap2.containsKey(tChar)) {
                hashMap1[sChar] = tChar
                hashMap2[tChar] = sChar
            } else {
                var getChar1 = hashMap1[sChar]
                var getChar2 = hashMap2[tChar]
                if (getChar1 != tChar || getChar2 !=sChar) {
                    return false
                }
            }
        }
        return true
    }
}

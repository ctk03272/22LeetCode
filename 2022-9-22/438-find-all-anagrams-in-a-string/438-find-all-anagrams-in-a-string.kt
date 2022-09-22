class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        var answer = mutableListOf<Int>();
        var count=IntArray(26)
        println('a'.toInt()-97)
        var lengthS = s.length
        var lengthP = p.length
        var nowMap = HashMap<Char, Int>()
        for (i in p.indices){
            var char=p[i]
            count[char.toInt()-97]++
        }
        var end = 0
        for (i in s.indices) {
            var now=s[i].toInt()-97
            count[now]--
            if(i>=p.length){
                count[s[end].toInt()-97]++
                end++
            }
            var hasToAdd=true
            for (j in p.indices){
                if(count[p[j].toInt()-97]!=0){
                    hasToAdd=false
                }
            }
            if(hasToAdd){
                answer.add(end)
            }
        }
        return answer
    }
}

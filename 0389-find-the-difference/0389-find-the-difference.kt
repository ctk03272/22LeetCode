class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var map: MutableMap<Char, Int> = s.groupingBy() { it }.eachCount() as MutableMap<Char, Int>
        for (ch in t.toCharArray()) {
            if (map.containsKey(ch)) {
                var count = map[ch]
                if (count == 1) {
                    map.remove(ch)
                } else {
                    if (count != null) {
                        map[ch] = count - 1
                    }
                }
            } else {
                return ch
            }
        }
        return 'a'
    }
}

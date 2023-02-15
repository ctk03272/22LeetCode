class Solution {
        fun reverseWords(s: String): String {
            return s.split(" ").map { s: String -> s.reversed() }.joinToString (" ");
        }
}
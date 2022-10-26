class Solution {
   public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1Join = Arrays.stream(word1).collect(Collectors.joining());
        String word2Join = Arrays.stream(word2).collect(Collectors.joining());
        return word1Join.equals(word2Join);
    }
}
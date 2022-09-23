class Solution {
    public String getHint(String secret, String guess) {
        int length = secret.length();
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < length; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                continue;
            }
            int secetInt = secret.charAt(i) - '0';
            int guessInt = guess.charAt(i) - '0';
            ++secretCount[secetInt];
            ++guessCount[guessInt];
        }
        for (int i = 0; i < 10; i++) {
            if(secretCount[i]!=0){
                cows+=Math.min(secretCount[i],guessCount[i]);
            }
        }
        return bulls + "A" + cows + "B";
    }
}
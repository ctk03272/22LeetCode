class Solution {
    static String[] symbol = {"I", "V", "X", "L", "C", "D", "M"};

    public String intToRoman(int num) {
        String sb = "";
        while (num != 0) {
            int length = (int) (Math.log10(num) + 1);
            int index = 0;
            int first = num / (int) ((Math.pow(10, length - 1)));
            num-=first*(int) ((Math.pow(10, length - 1)));
            if (first >= 5) {
                index++;
            }
            if (first == 4 || first == 9) {
                sb+=String.valueOf(symbol[(length - 1) * 2 ]);
                sb+=String.valueOf(symbol[(length - 1) * 2 + index + 1]);
            } else {
                if (index == 1) {
                    sb+=String.valueOf(symbol[(length - 1) * 2 + index]);
                    first -=5;
                }
                for (int i = 0; i < first; i++) {
                    sb+=String.valueOf(symbol[(length - 1) * 2]);
                }
            }
        }
        return sb;
    }
}
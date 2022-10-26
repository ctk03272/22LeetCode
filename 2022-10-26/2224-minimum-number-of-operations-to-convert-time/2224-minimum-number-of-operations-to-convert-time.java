class Solution {
    public int convertTime(String current, String correct) {
        int currentMinute = convertToMinute(current);
        int correctMinute = convertToMinute(correct);
        int count = 0;
        int[] addArray = new int[]{60, 15, 5, 1};
        int index=0;
        while (index<addArray.length){
            if (currentMinute==correctMinute){
                break;
            }
            int nowAdd=addArray[index];
            if(currentMinute+nowAdd<=correctMinute){
                count++;
                currentMinute+=nowAdd;
            }else{
                index++;
            }
        }
        return count;
    }

    private int convertToMinute(String now) {
        String[] hourAndMinute = now.split(":");
        int hour = Integer.parseInt(hourAndMinute[0]);
        int minute = Integer.parseInt(hourAndMinute[1]);
        return hour * 60 + minute;
    }
}
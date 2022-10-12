class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        int[] prev = null;
        for (int i = 0; i < intervals.length; i++) {
            int[] now = intervals[i];
            if (prev == null) {
                prev = now;
            } else {
                if (isInterSection(prev,now)){
                    prev=mergeInterval(prev,now);
                }else{
                    list.add(prev);
                    prev=now;
                }
            }
        }
        list.add(prev);
        list.sort((o1, o2) -> o1[0]-o2[0]);
        return list.toArray(new int[list.size()][2]);
    }


    public int[] mergeInterval(int[] interval1, int[] interval2) {
        int start = Math.min(interval1[0], interval2[0]);
        int end = Math.max(interval1[1], interval2[1]);
        return new int[]{start, end};
    }

    public boolean isInterSection(int[] interval1, int[] interval2) {
        if (interval1[0] < interval2[0] && interval1[1] < interval2[0]) {
            return false;
        } else if (interval2[0] < interval1[0] && interval2[1] < interval1[0]) {
            return false;
        } else {
            return true;
        }
    }
}
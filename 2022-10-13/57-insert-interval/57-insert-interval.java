class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ints = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] now = intervals[i];
            if (isInterSection(now, newInterval)) {
                newInterval = mergeInterval(now, newInterval);
            } else {
                ints.add(now);
            }
        }
        ints.add(newInterval);
        ints.sort((o1, o2) -> o1[0]-o2[0]);
        return  ints.toArray(new int[ints.size()][2]);
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
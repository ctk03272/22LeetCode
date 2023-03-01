class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = Arrays.stream(weights).sum();

        while (left < right) {
            int mid = (int) Math.floor((left + right) / 2);
            int taskDay = getTaskDay(weights, mid);
            if (taskDay < days) {
                right = mid;
            } else if (taskDay > days) {
                left = mid + 1;
            } else if (taskDay == days) {
                if (getTaskDay(weights, mid - 1) != taskDay) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return left;
    }

    int getTaskDay(int[] weights, int mid) {
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < weights.length; i++) {
            temp += weights[i];
            if (weights[i] > mid) {
                return 987654321;
            }
            if (i == weights.length - 1 || temp + weights[i + 1] > mid) {
                ans++;
                temp = 0;
            }
        }
        return ans;
    }

}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow=findSearchRow(matrix,target);
        if(targetRow<0){
            return false;
        }
        int[] getRow = matrix[targetRow];
        return Arrays.binarySearch(getRow, target) >= 0;
    }

    public int findSearchRow(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            long midVal = matrix[mid][0];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid;
        }
        return high;
    }
}
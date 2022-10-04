/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end) / 2;
        return new TreeNode(nums[mid], sortedArrayToBST(sliceArray(nums, start, mid - 1)), sortedArrayToBST(sliceArray(nums, mid + 1, end)));
    }

    int[] sliceArray(int[] nums, int start, int end) {
        int length = end - start + 1;
        int[] sliced = new int[length];
        for (int i = 0; i < length; i++) {
            sliced[i] = nums[start + i];
        }
        return sliced;
    }
}
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
    int answer = -1;
    int count;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        findKthSmallest(root);
        return answer;
    }

    public void findKthSmallest(TreeNode root){
        if (root==null || answer!=-1){
            return;
        }
        findKthSmallest(root.left);
        count--;
        if(count==0){
            answer=root.val;
        }
        findKthSmallest(root.right);
    }
}

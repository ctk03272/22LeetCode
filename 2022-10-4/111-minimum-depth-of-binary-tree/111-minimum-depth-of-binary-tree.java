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
public class Solution {
    int ans = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        findDepth(root,1);
        return ans;
    }

    void findDepth(TreeNode root, int depth) {
        if (depth>ans){
            return;
        }
        if (root.left == null && root.right == null) {
            ans = Math.min(ans, depth);
        }
        if(root.left!=null) {
            findDepth(root.left,depth+1);
        }
        if (root.right!=null){
            findDepth(root.right,depth+1);
        }
    }
}
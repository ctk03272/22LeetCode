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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode a, TreeNode b){
        if (a==null && b==null){
            return true;
        }else if(a==null && b!=null){
            return false;
        }else if(a!=null && b==null){
            return false;
        }else{
            return a.val==b.val && isSymmetric(a.left,b.right) && isSymmetric(a.right,b.left);
        }
    }
}
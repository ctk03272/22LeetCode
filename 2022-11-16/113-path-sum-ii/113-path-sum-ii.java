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
    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        makeTargetSum(root,targetSum,0,new ArrayList<>());
        return ans;
    }

    public void makeTargetSum(TreeNode root, int targetSum, int nowSum,List<Integer> sumList) {
        if (root == null) {
            return;
        }
        nowSum=nowSum+root.val;
        sumList.add(root.val);
        if (targetSum == nowSum && root.left==null && root.right==null) {
            ans.add(sumList);
            return;
        }
        makeTargetSum(root.left, targetSum, nowSum, new ArrayList<>(sumList));
        makeTargetSum(root.right, targetSum, nowSum,new ArrayList<>(sumList));
    }
}
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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> integers = new LinkedList<>();
        integers.add(root);
        int count=integers.size();
        while (!integers.isEmpty()) {
            count--;
            TreeNode now=integers.poll();
            if (now.left!=null){
                integers.add(now.left);
            }
            if(now.right!=null){
                integers.add(now.right);
            }

            if (count==0){
                ans.add(now.val);
                count=integers.size();
            }
        }
        return ans;
    }
}
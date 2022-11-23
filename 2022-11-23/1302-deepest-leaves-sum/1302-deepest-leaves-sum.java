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
   public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int ans=root.val;
        queue.add(root);
        while (!queue.isEmpty()){
            int tempAns=0;
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                tempAns+=node.val;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            ans=tempAns;
        }
        return ans;
    }
}
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean direction = true;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        queue.add(root);
        int len;
        while (!queue.isEmpty()) {
            len = queue.size();
            temp = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode now = queue.poll();
                if (now.left != null) {
                    queue.add(now.left);
                }
                if (now.right != null) {
                    queue.add(now.right);
                }
                temp.add(now.val);
            }
            if (direction){
                ans.add(temp);
            }else {
                Collections.reverse(temp);
                ans.add(temp);
            }
            direction=!direction;
        }
        return ans;
    }
}
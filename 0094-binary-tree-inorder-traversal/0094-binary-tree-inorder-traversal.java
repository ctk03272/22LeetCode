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
	List<Integer> ans;

	public List<Integer> inorderTraversal(TreeNode root) {
		ans = new ArrayList<>();
		getinorderTraversal(root);
		return ans;
	}

	void getinorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		getinorderTraversal(root.left);
		ans.add(root.val);
		getinorderTraversal(root.right);
	}
}
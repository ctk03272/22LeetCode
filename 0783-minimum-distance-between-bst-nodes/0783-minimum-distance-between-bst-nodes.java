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
	PriorityQueue<Integer> pq = new PriorityQueue<>();

	void inorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		pq.add(root.val);
		inorderTraversal(root.right);
	}

	public int minDiffInBST(TreeNode root) {
		inorderTraversal(root);

		int ans = Integer.MAX_VALUE;
		int prev = pq.poll();
		while (!pq.isEmpty()) {
			int now = pq.poll();
			ans = Math.min(ans, now - prev);
			prev = now;
		}

		return ans;
	}
}
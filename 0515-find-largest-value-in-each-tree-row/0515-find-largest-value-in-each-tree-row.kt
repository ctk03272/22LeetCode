/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun largestValues(root: TreeNode?): List<Int> {
        var size: Int = 0
        var count: Int = 0
        var max = Integer.MIN_VALUE
        var ans = mutableListOf<Int>()
        var que: Queue<TreeNode> = LinkedList<TreeNode>();
        if (root == null) {
            return ans
        }
        que.add(root)
        size = que.size
        while (que.isNotEmpty()) {
            if (count == size) {
                ans.add(max)
                size=que.size
                count = 0
                max = Integer.MIN_VALUE
            } else {
                var now: TreeNode = que.poll()
                max = Math.max(max, now.`val`)
                if (now.left != null) {
                    que.add(now.left)
                }
                if (now.right != null) {
                    que.add(now.right)
                }
                count++
            }
        }
        ans.add(max)
        return ans;
    }
}

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
    private var ans:MutableList<Int> = mutableListOf()

    fun postorderTraversal(root: TreeNode?): List<Int> {
        dfs(root)
        return ans       
    }
    fun dfs(root:TreeNode?){
        if (root==null){
            return;
        }
        dfs(root.left)
        dfs(root.right)
        ans.add(root.`val`)
    }
}
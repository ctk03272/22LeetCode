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

    fun preorderTraversal(root: TreeNode?): List<Int> {
        dfs(root)
        //
        return ans
    }
    
    fun dfs(root:TreeNode?){
        if (root==null){
            return;
        }
        ans.add(root.`val`)
        dfs(root.left)
        dfs(root.right)
    }
}
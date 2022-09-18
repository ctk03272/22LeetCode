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
    fun isValidBST(root: TreeNode?): Boolean {
        return isValid(root)
    }

    fun isValid(root: TreeNode?, min: Long = Long.MIN_VALUE, max: Long = Long.MAX_VALUE): Boolean {
        if (root == null) {
            return true
        } else {
            if (root.`val` <= min || root.`val` >= max) {
                return false
            } else
                return isValid(root.left, min, root.`val`.toLong()) && isValid(root.right, root.`val`.toLong(), max)
        }
    }
}
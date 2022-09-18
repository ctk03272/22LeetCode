class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root != null && p != null && q != null) {
            if ((root.`val` - p.`val` > 0 && root.`val` - q.`val` > 0) || (root.`val` - p.`val` < 0 && root.`val` - q.`val` < 0)){
                if (root.`val` > p.`val`) {
                    return lowestCommonAncestor(root.left, p, q)
                } else {
                    return lowestCommonAncestor(root.right, p, q)
                }
            }else{
                return root
            }
        }
        return root;
    }
}
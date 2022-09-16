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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return emptyList()
        }
        var que: Queue<TreeNode> = LinkedList<TreeNode>()
        que.add(root)
        var answer= mutableListOf<List<Int>>(mutableListOf(root.`val`))
        var list= mutableListOf<TreeNode>()
        while (true){
            var now=que.poll()
            if (now.left!=null){
                list.add(now.left!!)
            }
            if (now.right!=null){
                list.add(now.right!!)
            }
            if(que.isEmpty()){
                if(list.isEmpty()){
                    break
                }else{
                    answer.add(list.map { it.`val` })   
                    que.addAll(list)
                    list= mutableListOf()
                }
            }
        }
        return answer
    }
}
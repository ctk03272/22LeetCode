/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
     fun preorder(root: Node?): List<Int> {
        var stack=Stack<Node>()
        if(root==null){
            return emptyList()
        }
        var answer= mutableListOf<Int>()
        stack.add(root)
        while (!stack.isEmpty()){
            var now=stack.pop()
            answer.add(now.`val`)
            for (i in now.children.size-1 downTo 0){
                stack.push(now.children[i])
            }
        }
        return answer
    }
}
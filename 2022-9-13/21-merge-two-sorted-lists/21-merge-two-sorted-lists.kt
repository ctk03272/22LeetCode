/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var ans:ListNode?=ListNode(-1)
        var first=ans
        var cursor1=list1
        var cursor2=list2
        while(true){
            if(cursor1==null){
                ans?.next=cursor2
                break
            }else if(cursor2==null){
                ans?.next=cursor1
                break
            }else{
                val v1=cursor1.`val`
                val v2=cursor2.`val`
                if(v1<=v2){
                    ans?.next=cursor1
                    cursor1=cursor1.next
                }else{
                    ans?.next=cursor2
                    cursor2=cursor2.next
                }
                ans=ans?.next
            }
        }
        return first?.next
    }
}
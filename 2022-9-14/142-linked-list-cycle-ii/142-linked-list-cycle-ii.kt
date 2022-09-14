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
    fun detectCycle(head: ListNode?): ListNode? {
        var slow=head
        var fast=head
        while (slow!=null && fast!=null){
            if(slow.next==null || fast.next==null || fast.next?.next==null){
                return null;
            }
            slow=slow.next
            fast= fast.next?.next
            if(slow==fast){
                var slow2=head;
                while (slow2!=null){
                    if (slow2==slow){
                        return slow2
                    }
                    slow=slow?.next
                    slow2=slow2.next
                }
            }
        }
        return null
    }
}
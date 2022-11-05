/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head != null && head.next == null) {
            return head;
        } else {
            ListNode next = head.next;
            ListNode tempHead = head;
            ListNode temp = head.next.next;
            head = next;
            head.next = tempHead;
            tempHead.next = swapPairs(temp);

        }
        return head;
    }
}
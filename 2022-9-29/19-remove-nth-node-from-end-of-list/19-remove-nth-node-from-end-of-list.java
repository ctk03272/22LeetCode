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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode();
        ans.next = head;
        ListNode prev = ans;
        int i = 0;
        while (head != null) {
            if (i == n) {
                head = head.next;
                prev = prev.next;
            } else {
                head = head.next;
                i++;
            }
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        return ans.next;
    }
}
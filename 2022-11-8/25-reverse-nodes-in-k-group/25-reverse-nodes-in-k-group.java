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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int count = k;
        ListNode start = head;
        ListNode now = head;
        while (count > 1) {
            if (now == null) {
                break;
            }
            now = now.next;
            count--;
        }
        ListNode next;
        if (now== null) {
            return start;
        } else {
            next = reverseKGroup(now.next, k);
        }
        now.next = null;
        ListNode ans = reverseNode(start);
        start.next = next;
        return ans;
    }

    public ListNode reverseNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode now = head;
        ListNode next = reverseNode(now.next);
        now.next.next = now;
        now.next = null;
        return next;
    }
}
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
public void reorderList(ListNode head) {
        ListNode now = head;
        int count = 0;
        boolean isOdd = false;
        Stack<ListNode> listNodes = new Stack<>();
        while (now != null) {
            count++;
            listNodes.push(now);
            now = now.next;
        }
        isOdd = (count & 2) != 0;
        count = count / 2;
        now = head;
        while (count > 0) {
            ListNode temp = now.next;
            now.next = listNodes.pop();
            now.next.next = temp;
            now = now.next.next;
            count--;
        }
        if (isOdd) {
            now.next = listNodes.pop();
        }
        now.next = null;
    }
}
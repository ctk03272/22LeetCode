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
    public ListNode oddEvenList(ListNode head) {
  boolean t=false;
        ListNode even = new ListNode();
        ListNode evenStart = even;
        ListNode odd = new ListNode();
        ListNode answer = odd;
        while (head != null) {
            if (t) {
                even.next = head;
                even=even.next;
                head = head.next;
                even.next=null;
            } else {
                odd.next = head;
                odd=odd.next;
                head = head.next;
                odd.next=null;
            }
            t=!t;
        }
        odd.next=evenStart.next;

        return answer.next;
    }

}
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
    public ListNode sortList(ListNode head) {
        if (head==null||head.next == null) {
            return head;
        }
        ListNode mid = divideNode(head);
        return mergeNode(sortList(head), sortList(mid));
    }

    ListNode mergeNode(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode fist = ans;
        while (true) {
            if (list1 == null) {
                ans.next = list2;
                break;
            } else if (list2 == null) {
                ans.next = list1;
                break;
            } else {
                int v1 = list1.val;
                int v2 = list2.val;
                if (v1 <= v2) {
                    ans.next = list1;
                    list1 = list1.next;
                } else {
                    ans.next = list2;
                    list2 = list2.next;
                }
                ans = ans.next;
            }
        }
        return fist.next;
    }

    ListNode divideNode(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;

        }
        if (fast != null) {
            prev=slow;
            slow = slow.next;
        }
        prev.next=null;
        return slow;
    }
}
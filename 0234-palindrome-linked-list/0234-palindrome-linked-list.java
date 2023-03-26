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
    public boolean isPalindrome(ListNode head) {
        boolean answer=true;
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        fast=head;
        slow=reverseNode(slow);
        while (slow!=null & fast!=null){
            if(slow.val!= fast.val){
                return false;
            }
            fast=fast.next;
            slow=slow.next;
        }
        return answer;
    }
    public ListNode reverseNode(ListNode head){
        ListNode prev=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

}
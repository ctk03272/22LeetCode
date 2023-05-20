/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var swapNodes = function(head, k) {
        var temp = head,a = head,b = head;
        var c = 0;
        while(temp != null){ 
            c++;
            if(c == k) a = temp;
            temp = temp.next;
        }
        temp = head;
        for(var i=1;i<=c;i++){
            if(i == (c + 1 - k)){ 
                b = temp;
                break;
            }
            temp = temp.next;
        }
        var t = a.val;
        a.val = b.val;
        b.val = t;
        return head
};
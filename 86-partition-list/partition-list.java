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
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;

        // Two dummy heads
        ListNode beforeDummy = new ListNode(0);
        ListNode afterDummy = new ListNode(0);

        ListNode before = beforeDummy; 
        ListNode after = afterDummy;  
        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                before.next = temp;   
                before = before.next;
            } else {
                after.next = temp;    
                after = after.next;   
            }
            temp = temp.next;         
        }

        after.next = null;          
        before.next = afterDummy.next; 

        return beforeDummy.next;
    }
}

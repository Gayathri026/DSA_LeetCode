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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        int flag;

        while (temp != null) {
            if (temp.next == null || temp.val != temp.next.val) {
                prev.next = temp;
                prev = prev.next;
                temp = temp.next;
            } 
            else {
                flag = temp.val;
                while (temp != null && temp.val == flag) {
                    temp = temp.next; 
                }
                prev.next = temp; 
            }
        }
        return dummy.next;
    }
}

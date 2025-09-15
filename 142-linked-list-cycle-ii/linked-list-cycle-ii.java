/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp;
       Set<ListNode> hm = new HashSet<>();
for (temp = head; temp != null; temp = temp.next) {
    if (hm.contains(temp)) {
        return temp; 
    }
    hm.add(temp);
}
return null; 
        
    }
}
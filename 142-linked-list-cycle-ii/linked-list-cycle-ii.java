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
        HashMap<ListNode,Integer> hm = new HashMap<>();
        for(temp = head;temp!=null;temp = temp.next){
            if(hm.containsKey(temp))return temp;
            hm.put(temp,1);
        }
        return null;
        
    }
}
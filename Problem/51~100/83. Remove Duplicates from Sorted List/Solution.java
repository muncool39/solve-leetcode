/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { 
          this.val = val; 
      }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode th = head;
        while(head != null && head.next != null) {
            ListNode next = head.next;
            if(head.val != next.val) {
                head = next;
                continue;
            }
            head.next = next.next;
        }
        return th;
    }
}
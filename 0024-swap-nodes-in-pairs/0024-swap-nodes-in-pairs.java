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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode list =  head;
        while (list != null && list.next != null) {
            int v = list.val;
            list.val = list.next.val;
            list.next.val = v;
            list = list.next.next;
        }
        return head;
    }
}
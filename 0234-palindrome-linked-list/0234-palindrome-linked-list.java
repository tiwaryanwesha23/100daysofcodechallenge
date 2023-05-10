class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = slow.next;
        slow.next = null;
        do{
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }while(next != null);
        while(pre != null && head != null){
            if(pre.val != head.val) return false;
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}
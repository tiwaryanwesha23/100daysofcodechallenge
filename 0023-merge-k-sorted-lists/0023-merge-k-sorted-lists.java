class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = null;
        if(lists == null || lists.length == 0) return dummy.next;
        Queue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1, ListNode n2){
                return n1.val - n2.val;
            }
        });
        for(ListNode head : lists){
            cur = head;
            while(cur != null){
                pq.offer(cur);
                cur = cur.next;
            }
        }
        cur = dummy;
        while(!pq.isEmpty()){
            cur.next = pq.poll();
            cur = cur.next;
        }
        cur.next = null;
        return dummy.next;
    }
}
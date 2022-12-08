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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(ListNode li : lists){
            ListNode curr = li;
            while(curr!=null){
                pq.offer(curr.val);
                curr = curr.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        while(!pq.isEmpty()){
            ListNode node = new ListNode(pq.poll());
            ptr.next = node;
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
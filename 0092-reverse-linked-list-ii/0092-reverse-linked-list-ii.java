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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        if (left == right && head.next == null) return head;
        ListNode cur = head;
        ListNode prev = null;
        int counter = 1;
        while (counter < left) {
            prev = cur;
            cur = cur.next;
            ++counter;
        }
        ListNode internalPrev = null;
        for (int i = left; i <= right; i++) {
            ListNode next = cur.next;
            cur.next = internalPrev;
            internalPrev = cur;
            cur = next;
        }
        if (prev != null) {
            ListNode connectorNode = prev.next;
            prev.next = internalPrev;
            connectorNode.next = cur;
        } else {
            head.next = cur;
            return internalPrev;
        }
        return head;
    }
}
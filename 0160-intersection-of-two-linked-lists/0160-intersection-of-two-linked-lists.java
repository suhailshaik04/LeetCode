/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
        Set<ListNode> se = new HashSet<>();
        ListNode curr = headA;
        while(curr!=null){
            se.add(curr);
            curr = curr.next;
        }
        curr = headB;
        while(curr!=null){
            if(se.contains(curr)) return curr;
            curr = curr.next;
        }
        
        return null;
        */
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
        }
        return a;
    }
}
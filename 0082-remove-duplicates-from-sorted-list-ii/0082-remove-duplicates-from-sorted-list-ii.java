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
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        ListNode curr = head;
        while(curr!=null){
            if(map.containsKey(curr.val)){
                map.put(curr.val,map.get(curr.val)+1);
            }
            else map.put(curr.val,0);
            //map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr = curr.next;
        }
        for(Integer node : map.keySet()){
            if(map.get(node)==0){
                ListNode newNode = new ListNode(node);
                ptr.next = newNode;
                ptr = ptr.next;
            }
        }
        return dummy.next;
    }
}
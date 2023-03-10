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
    private final ListNode head;
    public Solution(ListNode head){
        this.head = head;
    }
    public int getRandom() {
        var current = head;
	    var i = 1;
	    var random = 0;
        while (current != null) {
            if (Math.random() < 1.0 / i++)
                random = current.val;
		current = current.next;
	}
	return random;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
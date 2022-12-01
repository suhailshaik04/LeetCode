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
    public static ListNode addFrst(Stack<ListNode> st){
        ListNode head = st.pop();
        while(!st.isEmpty()){
            ListNode curr = st.pop();
            curr.next = head;
            head = curr;
        }
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        /*
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        ListNode curr = head;
        boolean check = false;
        while(curr.next!=null){
            ListNode chk = curr.next;
            while(chk!=null){
                if(chk.val>curr.val){
                    check=true;
                    break;
                }
                chk = chk.next;
            }
            if(check==false){
                    ptr.next = curr;
                    ptr = ptr.next;
            }
            curr = curr.next;
            check= false;
        }
        ptr.next = curr;
        return dummy.next;
        */
        ListNode dummy = new ListNode(-1);
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            while(!st.isEmpty() && st.peek().val<curr.val){
            st.pop();
            }
            st.push(curr);
            curr = curr.next;
        }
        ListNode ans = addFrst(st);
        return ans;
    }
}
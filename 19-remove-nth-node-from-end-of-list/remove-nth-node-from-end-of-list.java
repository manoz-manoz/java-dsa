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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n<=0)
        return head;

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        ListNode current=dummy;
        for(int i=1;i<=n;i++)
        {
            if(temp==null)
            return head;
            temp=temp.next;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
            current=current.next;
        }
        if(current.next!=null)
        current.next=current.next.next;
        return dummy.next;
        
    }
}
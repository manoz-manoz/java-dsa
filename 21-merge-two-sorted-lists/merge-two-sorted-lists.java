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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        ListNode res;
        ListNode temp;
        if(l1.val<l2.val)
        {
            res=l1;
            l1=l1.next;
            temp=res;
        }
        else
        {
            res=l2;
            l2=l2.next;
            temp=res;
        }
        while(l1!=null && l2!=null)
        {
             if(l1.val<l2.val)
        {
           res= res.next=l1;
            l1=l1.next;
           
        }
        else
        {
            res=res.next=l2;
            l2=l2.next;
          
        }

        }
        if(l1!=null)
        res.next=l1;
        if(l2!=null)
        res.next=l2;
        return temp;
       
    }
}
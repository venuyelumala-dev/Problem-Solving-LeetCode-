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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
            ListNode p=head;
            ListNode q=p.next;
            ListNode r;
            p.next=null;
            while(q!=null){
                r=q.next;
                q.next=p;
                p=q;
                q=r;
    

            }
            return p;
    }
}
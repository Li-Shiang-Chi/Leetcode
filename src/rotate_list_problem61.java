/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;
        
        int length = 1;
        ListNode tmp = head;
        while(tmp.next != null){
            length++;
            tmp = tmp.next;
        }
        tmp.next = head; // make it a cycle.
        

        for(int i=length- k % length;i>1;i--)
            head = head.next;
        
        tmp = head.next;
        head.next = null;
        
        return tmp;
    }
}
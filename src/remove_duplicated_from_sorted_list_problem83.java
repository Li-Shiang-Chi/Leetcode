/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode flag = head;
        while(flag!=null){
            if(flag.next == null) break;
            if(flag.next.val == flag.val) flag.next = flag.next.next;
            else if(flag.next.val != flag.val) flag = flag.next;
        }
        return head;
    }
}
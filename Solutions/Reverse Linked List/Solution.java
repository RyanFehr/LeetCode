/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // return reverseHelper(head, null);
        return reverseHelperIter(head);
    }
    
    // Recursive
    public ListNode reverseHelper(ListNode head, ListNode newHead) {
        if(head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseHelper(next, head);
    }
    
    // Iterative
    public ListNode reverseHelperIter(ListNode head) {
        ListNode newTail = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = newTail;
            newTail = head;
            head = next;
        }
        return newTail;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        
        int carry = 0;
        int place = 0;
        
        ListNode output = new ListNode(place);
        
        while(l1 != null || l2 != null || carry != 0)
        {
            ListNode cur = new ListNode(0);
            int sum = 0;
            
            if(l2 != null) 
                sum += l2.val;
                
            if(l1 != null)
                sum += l1.val;
                
            sum += carry;
            place = sum % 10;
            cur.val = place;
            
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}
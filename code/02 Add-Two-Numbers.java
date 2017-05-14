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
        int carry = 0;
        int temp = 0;
        ListNode tln = new ListNode(0);
        ListNode result = tln;
        while(l1 != null && l2 != null){
            temp = l1.val + l2.val + carry;
            carry = temp / 10;
            tln.val = temp % 10;
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null || l2 != null || carry != 0){
                tln.next = new ListNode(carry);
                tln = tln.next;
            }
        }
        while(l1 != null){
            temp = l1.val + carry;
            carry = temp / 10;
            tln.val = temp % 10;
            l1 = l1.next;
            if(l1 != null || carry == 1){
                tln.next = new ListNode(carry);
                tln = tln.next;
            }
        }
        while(l2 != null){
            temp = l2.val + carry;
            carry = temp / 10;
            tln.val = temp % 10;
            l2 = l2.next;
            if(l2 != null || carry == 1){
                tln.next = new ListNode(carry);
                tln = tln.next;
            }
        }
        return result;
    }
}
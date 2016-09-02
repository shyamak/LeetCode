/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//This is an O(n) time and O(1) space solution
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        
        //finding the middle of the linked list
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode reverseHead = slow.next;
        slow.next = null;
        
        //Reverse the second half of the linked list
        ListNode p1 = reverseHead;
        ListNode p2 = p1.next;
        reverseHead.next = null;
        while (p1 != null && p2 != null) {
            ListNode t = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = t;
        }
        
        //comparison
        ListNode p = head;
        ListNode q = (p2==null?p1:p2);
        while (q != null) {
            if (p.val != q.val)
                return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }
}
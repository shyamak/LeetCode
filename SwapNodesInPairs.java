/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;
        while (current.next != null && current.next.next != null) {
            ListNode first = current;
            current = current.next;
            first.next = current.next;
                        
            ListNode second = current.next.next;
            current.next.next = current;
            current.next = second;
        }
        return temp.next;
    }
}

//Second approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode newHead = even;
        ListNode oddTemp = odd;
        ListNode evenTemp = even;
        while (even != null && odd != null) {
            if (evenTemp.next != null) { 
                if (evenTemp.next.next != null)
                    evenTemp = evenTemp.next.next;
                else
                    evenTemp = null;
            } else
                evenTemp = null;
            if (oddTemp.next != null) {
                if ( oddTemp.next.next != null)
                    oddTemp = oddTemp.next.next;
            
                else
                    oddTemp = null;
            } else
                oddTemp = null;
            even.next = odd;    
            even = evenTemp;
            if (even != null) {
                odd.next = even;
                odd = oddTemp;
            } else
                odd.next = oddTemp;
        }
        return newHead;
    }
}

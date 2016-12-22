/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode foo = new ListNode(0);
        foo.next = head;
        ListNode victim = foo;
        
        for (int i = 0; i < n; i++) {
            head = head.next; // let foo lead bar by n
        }
        if (head == null) { // delete the first element
            return foo.next.next;
        } else {
            while (head != null) {
                head = head.next;
                victim = victim.next;
            }
        }
        victim.next = victim.next.next;
        
        return foo.next;
    }
}
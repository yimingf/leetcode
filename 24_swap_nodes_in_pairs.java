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
        if (head == null) {
            return head;
        } // trivial check
        
        ListNode victim = new ListNode(-1);
        ListNode hoge = victim;
        hoge.next = head;
        ListNode foo = head;

        while (foo != null && foo.next != null) {
            ListNode bar = foo.next;

            hoge.next = bar;
            foo.next = bar.next;
            bar.next = foo;
            
            hoge = hoge.next;
            hoge = hoge.next;
            foo = foo.next;
        } // swap
        
        return victim.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }// trivial check
        
        ListNode victim = new ListNode(-1);
        ListNode hoge = victim;
        ListNode foo = l1;
        ListNode bar = l2;
        
        while (true) {
            if (foo == null) {
                hoge.next = bar;
                break;
            } else if (bar == null) {
                hoge.next = foo;
                break;
            } else if (foo.val < bar.val) {
                while (foo != null && foo.val < bar.val) {
                    hoge.next = foo;
                    foo = foo.next;
                    hoge = hoge.next;
                }
            } else {
                while (bar != null && bar.val <= foo.val) {
                    hoge.next = bar;
                    bar = bar.next;
                    hoge = hoge.next;
                }
            }
        }
        return victim.next;
    }
}
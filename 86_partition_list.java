import java.lang.Math;

public class Solution {
  public ListNode partition(ListNode head, int x) {
    ListNode foo = null;
    ListNode bar = head;
    ListNode baz = null;
    ListNode zap = null;
    ListNode hoge = null;
    ListNode piyo = null;
    
    if (head == null) {
      return null;
    }

    while (bar != null) {
      if (bar.val>=x) {
        baz = bar;
        break;
      } else {
        foo = bar;
        bar = bar.next;
      } // foo -> (new points) -> bar
    }
    if (bar != null) {
      zap = baz.next;  
    } else {
      return head;
    }

    while (zap != null) {
      if (zap.val<x) { // found old points
        hoge = zap;
        piyo = zap;
        zap = zap.next;
        while (zap != null && zap.val<x) {
          piyo = zap;
          zap = zap.next;
        } // find all old points
        // start of partition
        baz.next = zap;
        if (foo == null) {
          head = hoge;
        } else {
          foo.next = hoge;  
        }
        piyo.next = bar;
        foo = piyo;
      } else {
        baz = zap;
        zap = zap.next; // baz -> hoge -> (some old points) ->
      } // piyo -> zap
    }

    return head;
  }
}
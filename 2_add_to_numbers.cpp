class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = new ListNode (-1);
        ListNode* next = result;
        int carry = 0;
        int numa, numb, numc;
        ListNode* foo = l1, *bar = l2;
       
        while (foo != NULL || bar != NULL) {
            numa = (foo == NULL) ? 0 : foo->val;
            numb = (bar == NULL) ? 0 : bar->val;
            numc = numa + numb + carry;
            carry = (numc >= 10) ? 1 : 0;
            numc = numc % 10;
            ListNode* baz = new ListNode (numc);
            next->next = baz;
            next = baz;
            foo = (foo == NULL) ? NULL : foo -> next;
            bar = (bar == NULL) ? NULL : bar -> next;
        }
        if (carry) {
            next->next = new ListNode (1);
        }
        next = result -> next;
        delete result;
        return next;
    }
};
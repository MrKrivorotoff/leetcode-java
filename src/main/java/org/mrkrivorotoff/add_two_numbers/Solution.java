package org.mrkrivorotoff.add_two_numbers;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var sum = new ListNode();
        var tempNode = (ListNode)null;
        for (var digitNode = sum; l1 != null || l2 != null || digitNode.val > 9; digitNode = digitNode.next) {
            var digitNodeVal = digitNode.val;
            if (l1 != null) {
                digitNodeVal += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digitNodeVal += l2.val;
                l2 = l2.next;
            }
            digitNode.val = digitNodeVal % 10;
            digitNode.next = new ListNode(digitNodeVal / 10);
            tempNode = digitNode;
        }
        if (tempNode != null && tempNode.next.val == 0)
            tempNode.next = null;
        return sum;
    }
}
package org.mrkrivorotoff.add_two_numbers;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final var head = new ListNode();
        var carry = 0;
        for (var currentNode = head; l1 != null || l2 != null || carry != 0; currentNode = currentNode.next) {
            var sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
        }
        return head.next;
    }
}
package org.mrkrivorotoff.middle_of_the_linked_list;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {
        var middleNode = head;
        for (var node = head; node != null && node.next != null; node = node.next.next)
            middleNode = middleNode.next;
        return middleNode;
    }
}
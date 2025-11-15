package org.mrkrivorotoff.merge_two_sorted_lists;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var rootNode = getCandidateToAppend(list1, list2);
        if (rootNode == null) return null;

        var currentNode = rootNode;
        var candidateToPostpone = rootNode == list1 ? list2 : list1;
        while (true) {
            var candidateToAppend = getCandidateToAppend(currentNode.next, candidateToPostpone);
            if (candidateToAppend == null) break;
            candidateToPostpone = candidateToAppend == currentNode.next ? candidateToPostpone : currentNode.next;
            currentNode.next = candidateToAppend;
            currentNode = currentNode.next;
        }

        return rootNode;
    }

    private static ListNode getCandidateToAppend(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        return node1.val < node2.val ? node1 : node2;
    }
}
package org.mrkrivorotoff.merge_two_sorted_lists;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeTwoListsToNewList(list1, list2);
    }

    private static ListNode mergeTwoListsByChangingNodes(final ListNode list1, final ListNode list2) {
        final var rootNode = getCandidateToAppend(list1, list2);
        if (rootNode == null) return null;

        var candidateToPostpone = (rootNode == list1) ? list2 : list1;
        for (var currentNode = rootNode; ; currentNode = currentNode.next) {
            final var candidateToAppend = getCandidateToAppend(currentNode.next, candidateToPostpone);
            if (candidateToAppend == null)
                break;
            candidateToPostpone = (candidateToAppend == currentNode.next) ? candidateToPostpone : currentNode.next;
            currentNode.next = candidateToAppend;
        }
        return rootNode;
    }

    private static ListNode mergeTwoListsToNewList(ListNode list1, ListNode list2) {
        final var headNode = new ListNode();
        for (var currentNode = headNode; ; currentNode = currentNode.next) {
            final var candidate = getCandidateToAppend(list1, list2);
            if (candidate == null)
                break;
            if (candidate == list1)
                list1 = list1.next;
            else
                list2 = list2.next;
            currentNode.next = new ListNode(candidate.val);
        }
        return headNode.next;
    }

    private static ListNode getCandidateToAppend(final ListNode node1, final ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        return node1.val < node2.val ? node1 : node2;
    }
}
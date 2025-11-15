package org.mrkrivorotoff.merge_two_sorted_lists;

import org.mrkrivorotoff.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergeTwoListsToNewList(list1, list2);
    }

    private static ListNode mergeTwoListsByChangingNodes(ListNode list1, ListNode list2) {
        final var rootNode = getCandidateToAppend(list1, list2);
        if (rootNode == null) return null;

        var candidateToPostpone = (rootNode == list1) ? list2 : list1;
        var currentNode = rootNode;
        while (true) {
            final var candidateToAppend = getCandidateToAppend(currentNode.next, candidateToPostpone);
            if (candidateToAppend == null)
                break;
            candidateToPostpone = (candidateToAppend == currentNode.next) ? candidateToPostpone : currentNode.next;
            currentNode.next = candidateToAppend;
            currentNode = currentNode.next;
        }

        return rootNode;
    }

    private static ListNode mergeTwoListsToNewList(ListNode list1, ListNode list2) {
        final var rootNode = getCandidateToAppend(list1, list2);
        if (rootNode == null) return null;
        final var newList = new ListNode(rootNode.val);

        var node1 = rootNode.next;
        var node2 = (rootNode == list1) ? list2 : list1;
        var currentNode = newList;
        while (true) {
            final var candidate = getCandidateToAppend(node1, node2);
            if (candidate == null)
                break;
            if (candidate == node1)
                node1 = node1.next;
            else
                node2 = node2.next;
            currentNode.next = new ListNode(candidate.val);
            currentNode = currentNode.next;
        }

        return newList;
    }

    private static ListNode getCandidateToAppend(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        return node1.val < node2.val ? node1 : node2;
    }
}
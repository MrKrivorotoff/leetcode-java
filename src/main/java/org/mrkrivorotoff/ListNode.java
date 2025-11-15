package org.mrkrivorotoff;

import java.util.Objects;
import java.util.StringJoiner;

public final class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode ofValues(int... values) {
        ListNode current = null;
        for (var i = values.length - 1; i >= 0; i--)
            current = new ListNode(values[i], current);
        return current;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return toString(this);
    }

    public static String toString(ListNode head) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (ListNode node = head; node != null; node = node.next)
            stringJoiner.add(Integer.toString(node.val));
        return stringJoiner.toString();
    }
}
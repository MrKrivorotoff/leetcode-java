package org.mrkrivorotoff.merge_two_sorted_lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mrkrivorotoff.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var list1 = ListNode.ofValues(1, 2, 4);
        final var list2 = ListNode.ofValues(1, 3, 4);
        final var expected = ListNode.ofValues(1, 1, 2, 3, 4, 4);
        assertEquals(expected, solution.mergeTwoLists(list1, list2));
    }

    @Test
    void example2() {
        final var list1 = ListNode.ofValues();
        final var list2 = ListNode.ofValues();
        assertNull(solution.mergeTwoLists(list1, list2));
    }

    @Test
    void example3() {
        final var list1 = ListNode.ofValues();
        final var list2 = ListNode.ofValues(0);
        final var expected = ListNode.ofValues(0);
        assertEquals(expected, solution.mergeTwoLists(list1, list2));
    }
}
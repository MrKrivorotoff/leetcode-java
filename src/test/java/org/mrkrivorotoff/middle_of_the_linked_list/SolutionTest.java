package org.mrkrivorotoff.middle_of_the_linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mrkrivorotoff.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var head = ListNode.ofValues(1, 2, 3, 4, 5);
        final var expected = ListNode.ofValues(3, 4, 5);
        assertEquals(expected, solution.middleNode(head));
    }

    @Test
    void example2() {
        final var head = ListNode.ofValues(1, 2, 3, 4, 5, 6);
        final var expected = ListNode.ofValues(4, 5, 6);
        assertEquals(expected, solution.middleNode(head));
    }
}
package org.mrkrivorotoff.add_two_numbers;

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
        var list1 = ListNode.ofValues(2, 4, 3);
        var list2 = ListNode.ofValues(5, 6, 4);
        var expected = ListNode.ofValues(7, 0, 8);
        assertEquals(expected, solution.addTwoNumbers(list1, list2));
    }

    @Test
    void example2() {
        var list1 = ListNode.ofValues(0);
        var list2 = ListNode.ofValues(0);
        var expected = ListNode.ofValues(0);
        assertEquals(expected, solution.addTwoNumbers(list1, list2));
    }

    @Test
    void example3() {
        var list1 = ListNode.ofValues(9, 9, 9, 9, 9, 9, 9);
        var list2 = ListNode.ofValues(9, 9, 9, 9);
        var expected = ListNode.ofValues(8, 9, 9, 9, 0, 0, 0, 1);
        assertEquals(expected, solution.addTwoNumbers(list1, list2));
    }
}
package org.mrkrivorotoff.keep_multiplying_found_values_by_two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var nums = new int[]{5, 3, 6, 1, 12};
        assertEquals(24, solution.findFinalValue(nums, 3));
    }

    @Test
    void example2() {
        final var nums = new int[]{2, 7, 9};
        assertEquals(4, solution.findFinalValue(nums, 4));
    }
}
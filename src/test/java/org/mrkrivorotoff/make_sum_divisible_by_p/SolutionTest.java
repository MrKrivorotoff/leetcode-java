package org.mrkrivorotoff.make_sum_divisible_by_p;

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
        final var nums = new int[]{3, 1, 4, 2};
        assertEquals(1, solution.minSubarray(nums, 6));
    }

    @Test
    void example2() {
        final var nums = new int[]{6, 3, 5, 2};
        assertEquals(2, solution.minSubarray(nums, 9));
    }

    @Test
    void example3() {
        final var nums = new int[]{1, 2, 3};
        assertEquals(0, solution.minSubarray(nums, 3));
    }
}
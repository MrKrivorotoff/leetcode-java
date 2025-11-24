package org.mrkrivorotoff.running_sum_of_1d_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var nums = new int[]{1, 2, 3, 4};
        final var expected = new int[]{1, 3, 6, 10};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void example2() {
        final var nums = new int[]{1, 1, 1, 1, 1};
        final var expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void example3() {
        final var nums = new int[]{3, 1, 2, 10, 1};
        final var expected = new int[]{3, 4, 6, 16, 17};
        assertArrayEquals(expected, solution.runningSum(nums));
    }
}
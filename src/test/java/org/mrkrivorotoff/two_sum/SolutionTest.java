package org.mrkrivorotoff.two_sum;

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
        final var nums = new int[]{2, 7, 11, 15};
        final var expected = new int[]{0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 9));
    }

    @Test
    void example2() {
        final var nums = new int[]{3, 2, 4};
        final var expected = new int[]{1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }

    @Test
    void example3() {
        final var nums = new int[]{3, 3};
        final var expected = new int[]{0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }
}
package org.mrkrivorotoff.minimum_operations_to_make_array_sum_divisible_by_k;

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
        final var nums = new int[]{3, 9, 7};
        assertEquals(4, solution.minOperations(nums, 5));
    }

    @Test
    void example2() {
        final var nums = new int[]{4, 1, 3};
        assertEquals(0, solution.minOperations(nums, 4));
    }

    @Test
    void example3() {
        final var nums = new int[]{3, 2};
        assertEquals(5, solution.minOperations(nums, 6));
    }
}
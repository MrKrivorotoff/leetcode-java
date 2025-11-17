package org.mrkrivorotoff.check_if_all_1s_are_at_least_length_k_places_away;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var nums = new int[]{1, 0, 0, 0, 1, 0, 0, 1};
        assertTrue(solution.kLengthApart(nums, 2));
    }

    @Test
    void example2() {
        final var nums = new int[]{1, 0, 0, 1, 0, 1};
        assertFalse(solution.kLengthApart(nums, 2));
    }
}
package org.mrkrivorotoff.binary_prefix_divisible_by_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var nums = new int[]{0, 1, 1};
        final var expected = List.of(true, false, false);
        assertEquals(expected, solution.prefixesDivBy5(nums));
    }

    @Test
    void example2() {
        final var nums = new int[]{1, 1, 1};
        final var expected = List.of(false, false, false);
        assertEquals(expected, solution.prefixesDivBy5(nums));
    }

    @Test
    void additionalTestCase1() {
        final var nums = new int[]{1, 1, 0, 0, 0, 1, 0, 0, 1};
        final var expected = List.of(false, false, false, false, false, false, false, false, false);
        assertEquals(expected, solution.prefixesDivBy5(nums));
    }

    @Test
    void additionalTestCase2() {
        final var nums = new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        final var expected = List.of(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, true, true, true, false);
        assertEquals(expected, solution.prefixesDivBy5(nums));
    }

    @Test
    void additionalTestCase3() {
        final var nums = new int[]{1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0};
        final var expected = List.of(false, false, true, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, true, false, false, true, true, true, true, true, true, true, false, false, true, false, false, false, false, true, true);
        assertEquals(expected, solution.prefixesDivBy5(nums));
    }
}
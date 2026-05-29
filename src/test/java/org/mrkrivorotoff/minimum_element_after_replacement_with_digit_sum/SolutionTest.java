package org.mrkrivorotoff.minimum_element_after_replacement_with_digit_sum;

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
    void testExample1() {
        var nums = new int[]{10, 12, 13, 14};
        assertEquals(1, solution.minElement(nums));
    }

    @Test
    void testExample2() {
        var nums = new int[]{1, 2, 3, 4};
        assertEquals(1, solution.minElement(nums));
    }

    @Test
    void testExample3() {
        var nums = new int[]{999, 19, 199};
        assertEquals(10, solution.minElement(nums));
    }
}
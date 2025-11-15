package org.mrkrivorotoff.merge_sorted_array;

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
        final var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        final var nums2 = new int[]{2, 5, 6};
        final var expected = new int[]{1, 2, 2, 3, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example2() {
        final var nums1 = new int[]{1};
        final var nums2 = new int[]{};
        final var expected = new int[]{1};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void example3() {
        final var nums1 = new int[]{0};
        final var nums2 = new int[]{1};
        final var expected = new int[]{1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(expected, nums1);
    }
}
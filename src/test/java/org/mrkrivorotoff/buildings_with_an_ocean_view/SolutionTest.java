package org.mrkrivorotoff.buildings_with_an_ocean_view;

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
        var nums = new int[]{4, 2, 3, 1};
        var expected = new int[]{0, 2, 3};
        assertArrayEquals(expected, solution.findBuildings(nums));
    }

    @Test
    void example2() {
        var nums = new int[]{4, 3, 2, 1};
        var expected = new int[]{0, 1, 2, 3};
        assertArrayEquals(expected, solution.findBuildings(nums));
    }

    @Test
    void example3() {
        var nums = new int[]{1, 3, 2, 4};
        var expected = new int[]{3};
        assertArrayEquals(expected, solution.findBuildings(nums));
    }
}
package org.mrkrivorotoff.number_of_steps_to_reduce_a_number_to_zero;

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
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    void example2() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    void example3() {
        assertEquals(12, solution.numberOfSteps(123));
    }
}
package org.mrkrivorotoff._1_bit_and_2_bit_characters;

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
        final var bits = new int[]{1, 0, 0};
        assertTrue(solution.isOneBitCharacter(bits));
    }

    @Test
    void example2() {
        final var bits = new int[]{1, 1, 1, 0};
        assertFalse(solution.isOneBitCharacter(bits));
    }
}
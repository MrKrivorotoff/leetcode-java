package org.mrkrivorotoff.ransom_note;

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
        final var ransomNote = "a";
        final var magazine = "b";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void example2() {
        final var ransomNote = "aa";
        final var magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void example3() {
        final var ransomNote = "aa";
        final var magazine = "aab";
        assertTrue(solution.canConstruct(ransomNote, magazine));
    }
}
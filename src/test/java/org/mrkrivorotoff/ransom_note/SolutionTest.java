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
        var ransomNote = "a";
        var magazine = "b";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void example2() {
        var ransomNote = "aa";
        var magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    void example3() {
        var ransomNote = "aa";
        var magazine = "aab";
        assertTrue(solution.canConstruct(ransomNote, magazine));
    }
}
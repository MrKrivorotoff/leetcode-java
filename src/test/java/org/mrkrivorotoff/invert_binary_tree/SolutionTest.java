package org.mrkrivorotoff.invert_binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mrkrivorotoff.TreeNodeFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var treeRoot = TreeNodeFactory.ofValues(4, 2, 7, 1, 3, 6, 9);
        final var expected = TreeNodeFactory.ofValues(4, 7, 2, 9, 6, 3, 1);
        assertEquals(expected, solution.invertTree(treeRoot));
    }

    @Test
    void example2() {
        final var treeRoot = TreeNodeFactory.ofValues(2, 1, 3);
        final var expected = TreeNodeFactory.ofValues(2, 3, 1);
        assertEquals(expected, solution.invertTree(treeRoot));
    }

    @Test
    void example3() {
        final var treeRoot = TreeNodeFactory.ofValues();
        assertNull(solution.invertTree(treeRoot));
    }
}
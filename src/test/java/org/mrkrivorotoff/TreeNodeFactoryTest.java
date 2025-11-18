package org.mrkrivorotoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeNodeFactoryTest {
    @Test
    void createEmptyTree() {
        assertNull(TreeNodeFactory.ofValues());
    }

    @Test
    void createSingleNodeTree() {
        final var tree1 = new TreeNode(42);
        assertEquals(tree1, TreeNodeFactory.ofValues(42));
    }

    @Test
    void createSimpleTree() {
        final var tree2 = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        final var tree3 = new TreeNode(3, new TreeNode(6), new TreeNode(7));
        final var tree1 = new TreeNode(1, tree2, tree3);
        assertEquals(tree1, TreeNodeFactory.ofValues(1, 2, 3, 4, 5, 6, 7));
    }
}
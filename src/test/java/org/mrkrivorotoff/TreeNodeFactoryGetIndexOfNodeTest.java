package org.mrkrivorotoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeFactoryGetIndexOfNodeTest {
    @Test
    void getIndexOfNode0() {
        final var steps = new int[0];
        assertEquals(0, TreeNodeFactory.getIndexOfNode(steps, -1));
    }

    @Test
    void getIndexOfNode2() {
        final var steps = new int[]{1};
        assertEquals(2, TreeNodeFactory.getIndexOfNode(steps, 0));
    }

    @Test
    void getIndexOfNode3() {
        final var steps = new int[]{0, 0};
        assertEquals(3, TreeNodeFactory.getIndexOfNode(steps, 1));
    }

    @Test
    void getIndexOfNode5() {
        final var steps = new int[]{1, 0};
        assertEquals(5, TreeNodeFactory.getIndexOfNode(steps, 1));
    }

    @Test
    void getIndexOfNode7() {
        final var steps = new int[]{0, 0, 0};
        assertEquals(7, TreeNodeFactory.getIndexOfNode(steps, 2));
    }

    @Test
    void getIndexOfNode9() {
        final var steps = new int[]{0, 1, 0};
        assertEquals(9, TreeNodeFactory.getIndexOfNode(steps, 2));
    }

    @Test
    void getIndexOfNode11() {
        final var steps = new int[]{1, 0, 0};
        assertEquals(11, TreeNodeFactory.getIndexOfNode(steps, 2));
    }

    @Test
    void getIndexOfNode14() {
        final var steps = new int[]{1, 1, 1};
        assertEquals(14, TreeNodeFactory.getIndexOfNode(steps, 2));
    }
}
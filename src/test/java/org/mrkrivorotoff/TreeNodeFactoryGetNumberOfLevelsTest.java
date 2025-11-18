package org.mrkrivorotoff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TreeNodeFactoryGetNumberOfLevelsTest {
    @Test
    void getNumberOfLevelsWhenNumberOfValuesIs0() {
        assertEquals(0, TreeNodeFactory.getNumberOfLevels(0));
    }

    @Test
    void getNumberOfLevelsWhenNumberOfValuesIs1() {
        assertEquals(1, TreeNodeFactory.getNumberOfLevels(1));
    }

    @Test
    void getNumberOfLevelsWhenNumberOfValuesIs3() {
        assertEquals(2, TreeNodeFactory.getNumberOfLevels(3));
    }

    @Test
    void getNumberOfLevelsWhenNumberOfValuesIs7() {
        assertEquals(3, TreeNodeFactory.getNumberOfLevels(7));
    }

    @Test
    void getNumberOfLevelsWhenNumberOfValuesIs15() {
        assertEquals(4, TreeNodeFactory.getNumberOfLevels(15));
    }

    @Test
    void getNumberOfLevelsWhenNumberOfValuesIsIncorrect() {
        assertThrows(IllegalArgumentException.class, () -> TreeNodeFactory.getNumberOfLevels(12));
    }
}
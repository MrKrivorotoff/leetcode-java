package org.mrkrivorotoff.ransom_note;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IterableStringTest {
    @Test
    void emptyStringHasNext() {
        final var iterator = new IterableString("").iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    void emptyStringNextFailure() {
        final var iterator = new IterableString("").iterator();
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    void simpleStringForeachIteration() {
        for (var _ : new IterableString("Foo")) ;
    }

    @Test
    void simpleStringIterationResult() {
        final var iterator = new IterableString("Bar").iterator();
        assertEquals('B', iterator.next());
        assertEquals('a', iterator.next());
        assertEquals('r', iterator.next());
    }
}
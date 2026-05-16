package org.mrkrivorotoff.peeking_iterator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PeekingIteratorTest {
    @Test
    void example1() {
        var peekingIterator = new PeekingIterator(List.of(1, 2, 3).iterator());
        assertEquals(1, peekingIterator.next());
        assertEquals(2, peekingIterator.peek());
        assertEquals(2, peekingIterator.next());
        assertEquals(3, peekingIterator.next());
        assertFalse(peekingIterator.hasNext());
    }
}
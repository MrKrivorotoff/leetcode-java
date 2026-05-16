package org.mrkrivorotoff.peeking_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;

    private Integer peekedElement = null;
    private boolean wasElementPeeked = false;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = Objects.requireNonNull(iterator);
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (wasElementPeeked)
            return peekedElement;
        if (iterator.hasNext()) {
            var element = iterator.next();
            peekedElement = element;
            wasElementPeeked = true;
            return element;
        }
        throw new NoSuchElementException();
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (wasElementPeeked) {
            var element = peekedElement;
            peekedElement = null;
            wasElementPeeked = false;
            return element;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return wasElementPeeked || iterator.hasNext();
    }
}
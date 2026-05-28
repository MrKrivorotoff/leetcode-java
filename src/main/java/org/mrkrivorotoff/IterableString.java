package org.mrkrivorotoff;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class IterableString implements Iterable<Character> {
    private final String string;
    private final int stringLength;

    public IterableString(String string) {
        this.string = Objects.requireNonNull(string);
        this.stringLength = string.length();
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    private final class StringIterator implements Iterator<Character> {
        private int charIndex = 0;

        @Override
        public boolean hasNext() {
            return charIndex < stringLength;
        }

        @Override
        public Character next() {
            return charIndex < stringLength ? string.charAt(charIndex++) : throwNoSuchElementException();
        }

        private static <T> T throwNoSuchElementException() {
            throw new NoSuchElementException();
        }
    }
}
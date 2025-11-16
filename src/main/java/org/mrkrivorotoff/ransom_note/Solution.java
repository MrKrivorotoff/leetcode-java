package org.mrkrivorotoff.ransom_note;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        final var numberByLetter = new HashMap<Character, Integer>();
        for (var currentLetter : new IterableString(magazine)) {
            final int number = numberByLetter.getOrDefault(currentLetter, 0);
            numberByLetter.put(currentLetter, number + 1);
        }
        for (var currentLetter : new IterableString(ransomNote)) {
            final int number = numberByLetter.getOrDefault(currentLetter, 0);
            if (number == 0)
                return false;
            numberByLetter.put(currentLetter, number - 1);
        }
        return true;
    }
}

final class IterableString implements Iterable<Character> {
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
            if (charIndex >= stringLength)
                throw new NoSuchElementException();
            return string.charAt(charIndex++);
        }
    }
}
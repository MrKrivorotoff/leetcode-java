package org.mrkrivorotoff.ransom_note;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var numberByLetter = new HashMap<Character, Integer>();
        for (var currentLetter : new IterableString(magazine))
            numberByLetter.merge(currentLetter, 1, Integer::sum);
        for (var currentLetter : new IterableString(ransomNote)) {
            var number = numberByLetter.getOrDefault(currentLetter, 0);
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
            return charIndex < stringLength ? string.charAt(charIndex++) : throwNoSuchElementException();
        }

        private static <T> T throwNoSuchElementException() {
            throw new NoSuchElementException();
        }
    }
}
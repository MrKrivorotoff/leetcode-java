package org.mrkrivorotoff.ransom_note;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        final var ransomNoteLength = ransomNote.length();
        final var magazineLength = magazine.length();
        if (ransomNoteLength > magazineLength) return false;

        final var numberByLetter = new HashMap<Character, Integer>();
        for (var i = 0; i < magazineLength; i++) {
            final var currentLetter = magazine.charAt(i);
            int number = numberByLetter.getOrDefault(currentLetter, 0);
            numberByLetter.put(currentLetter, number + 1);
        }
        for (var i = 0; i < ransomNoteLength; i++) {
            final var currentLetter = ransomNote.charAt(i);
            int number = numberByLetter.getOrDefault(currentLetter, 0);
            if (number == 0)
                return false;
            numberByLetter.put(currentLetter, number - 1);
        }
        return true;
    }
}
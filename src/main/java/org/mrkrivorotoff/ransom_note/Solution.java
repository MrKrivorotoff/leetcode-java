package org.mrkrivorotoff.ransom_note;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var numberByLetter = new HashMap<Character, Integer>();
        for (int i = 0, n = magazine.length(); i < n; i++) {
            var currentLetter = magazine.charAt(i);
            numberByLetter.merge(currentLetter, 1, Integer::sum);
        }
        for (int i = 0, n = ransomNote.length(); i < n; i++) {
            var currentLetter = ransomNote.charAt(i);
            var number = numberByLetter.getOrDefault(currentLetter, 0);
            if (number == 0)
                return false;
            numberByLetter.put(currentLetter, number - 1);
        }
        return true;
    }
}
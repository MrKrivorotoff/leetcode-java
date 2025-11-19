package org.mrkrivorotoff._1_bit_and_2_bit_characters;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        var numberOfBits = -1;
        final var bitsLength = bits.length;
        for (var i = 0; i < bitsLength;) {
            numberOfBits = (bits[i] == 1) ? 2 : 1;
            i += numberOfBits;
        }
        return numberOfBits == 1;
    }
}
package org.mrkrivorotoff._1_bit_and_2_bit_characters;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        var i = 0;
        var bitsLength = bits.length;
        while (i < bitsLength - 1)
            i += bits[i] + 1;
        return i == bitsLength - 1;
    }
}
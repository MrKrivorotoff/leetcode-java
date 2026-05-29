package org.mrkrivorotoff._1_bit_and_2_bit_characters;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        var i = bits.length - 2;
        while (i >= 0 && bits[i] > 0)
            i--;
        return (bits.length - i) % 2 == 0;
    }
}
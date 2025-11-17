package org.mrkrivorotoff.number_of_steps_to_reduce_a_number_to_zero;

class Solution {
    public int numberOfSteps(int num) {
        var counter = 0;
        var current = num;
        while (current != 0) {
            if ((current & 1) == 1)
                current--;
            else
                current >>= 1;
            counter++;
        }
        return counter;
    }
}
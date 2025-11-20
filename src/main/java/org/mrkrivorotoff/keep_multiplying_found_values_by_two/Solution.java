package org.mrkrivorotoff.keep_multiplying_found_values_by_two;

import java.util.HashSet;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        final var setOfNums = new HashSet<Integer>();
        for (var num : nums)
            setOfNums.add(num);
        while (setOfNums.contains(original))
            original <<= 1;
        return original;
    }
}
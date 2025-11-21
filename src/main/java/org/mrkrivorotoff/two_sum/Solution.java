package org.mrkrivorotoff.two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        final var cachedIndexByNum = new HashMap<Integer, Integer>();
        final var numsLength = nums.length;
        for (var i = 0; i < numsLength; i++) {
            final var current = nums[i];
            var cachedIndex = cachedIndexByNum.get(target - current);
            if (cachedIndex != null)
                return new int[] { cachedIndex, i };
            cachedIndexByNum.put(current, i);
        }
        throw new IllegalArgumentException();
    }
}
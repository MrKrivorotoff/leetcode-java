package org.mrkrivorotoff.two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        var cachedIndexByNum = new HashMap<Integer, Integer>();
        for (int i = 0, n = nums.length; i < n; i++) {
            var current = nums[i];
            var cachedIndex = cachedIndexByNum.get(target - current);
            if (cachedIndex != null)
                return new int[] { cachedIndex, i };
            cachedIndexByNum.put(current, i);
        }
        throw new IllegalArgumentException();
    }
}
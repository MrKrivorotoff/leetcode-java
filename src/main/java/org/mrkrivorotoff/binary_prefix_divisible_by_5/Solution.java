package org.mrkrivorotoff.binary_prefix_divisible_by_5;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        final var numsLength = nums.length;
        final var result = new ArrayList<Boolean>(numsLength);
        for (int i = 0, remain = 0; i < numsLength; i++) {
            remain = ((remain << 1) + nums[i]) % 5;
            result.add(remain == 0);
        }
        return result;
    }
}
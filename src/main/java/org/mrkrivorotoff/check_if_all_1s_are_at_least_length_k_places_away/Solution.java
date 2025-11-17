package org.mrkrivorotoff.check_if_all_1s_are_at_least_length_k_places_away;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        final var numsLength = nums.length;
        for (int i = 0, lastIndOf1 = -1; i < numsLength; i++)
            if (nums[i] == 1) {
                if (lastIndOf1 != -1 && (i - lastIndOf1) <= k)
                    return false;
                lastIndOf1 = i;
            }
        return true;
    }
}
package org.mrkrivorotoff.make_sum_divisible_by_p;

class Solution {
    public int minSubarray(int[] nums, int p) {
        final var numsLength = nums.length;
        var totalSum = 0L;
        for (var num : nums)
            totalSum += num;
        if (totalSum % p == 0)
            return 0;
        var minLength = numsLength;
        for (var startIndex = 0; startIndex < numsLength; startIndex++) {
            var subSum = 0L;
            for (var endIndex = startIndex; endIndex < numsLength; endIndex++) {
                subSum += nums[endIndex];
                if ((totalSum - subSum) % p == 0)
                    minLength = Math.min(minLength, endIndex - startIndex + 1);
            }
        }
        return minLength == numsLength ? -1 : minLength;
    }
}
package org.mrkrivorotoff.running_sum_of_1d_array;

class Solution {
    public int[] runningSum(int[] nums) {
        return createRunningSumOfNumsArray(nums);
    }

    private static int[] changeNumsArrayToRunningSum(final int[] nums) {
        final var numsLength = nums.length;
        for (var i = 1; i < numsLength; i++)
            nums[i] += nums[i - 1];
        return nums;
    }

    private static int[] createRunningSumOfNumsArray(final int[] nums) {
        final var numsLength = nums.length;
        final var result = new int[numsLength];
        result[0] = nums[0];
        for (var i = 1; i < numsLength; i++)
            result[i] = result[i - 1] + nums[i];
        return result;
    }
}
package org.mrkrivorotoff.running_sum_of_1d_array;

class Solution {
    public int[] runningSum(int[] nums) {
        return createRunningSumOfNumsArray(nums);
    }

    private static int[] changeNumsArrayToRunningSum(int[] nums) {
        for (int i = 1, n = nums.length; i < n; i++)
            nums[i] += nums[i - 1];
        return nums;
    }

    private static int[] createRunningSumOfNumsArray(int[] nums) {
        var numsLength = nums.length;
        var result = new int[numsLength];
        result[0] = nums[0];
        for (var i = 1; i < numsLength; i++)
            result[i] = result[i - 1] + nums[i];
        return result;
    }
}
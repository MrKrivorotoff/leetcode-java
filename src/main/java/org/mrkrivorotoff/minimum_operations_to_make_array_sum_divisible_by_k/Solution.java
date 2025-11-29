package org.mrkrivorotoff.minimum_operations_to_make_array_sum_divisible_by_k;

class Solution {
    public int minOperations(int[] nums, int k) {
        var sum = 0;
        for (var num : nums)
            sum += num;
        return sum % k;
    }
}
package org.mrkrivorotoff.minimum_element_after_replacement_with_digit_sum;

class Solution {
    public int minElement(int[] nums) {
        var min = Integer.MAX_VALUE;
        for (var num : nums) {
            var sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (min > sum)
                min = sum;
        }
        return min;
    }
}
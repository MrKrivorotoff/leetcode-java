package org.mrkrivorotoff.merge_sorted_array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        final var result = new int[nums1.length];
        for (int i = 0, j = 0, k = 0; i < m || j < n; k++) {
            final var num1 = i < m ? nums1[i] : Integer.MAX_VALUE;
            final var num2 = j < n ? nums2[j] : Integer.MAX_VALUE;
            if (num1 < num2) {
                result[k] = num1;
                i++;
            } else {
                result[k] = num2;
                j++;
            }
        }
        System.arraycopy(result, 0, nums1, 0, m + n);
    }
}
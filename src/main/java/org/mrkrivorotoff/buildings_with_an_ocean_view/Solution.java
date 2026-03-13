package org.mrkrivorotoff.buildings_with_an_ocean_view;

import java.util.ArrayList;

class Solution {
    public int[] findBuildings(int[] heights) {
        var result = new ArrayList<Integer>(heights.length);
        for (int i = heights.length - 1, maxHeight = 0; i >= 0; i--) {
            var currHeight = heights[i];
            if (currHeight > maxHeight) {
                maxHeight = currHeight;
                result.add(i);
            }
        }
        return reversedIntListToArray(result);
    }

    private static int[] reversedIntListToArray(ArrayList<Integer> list) {
        var size = list.size();
        var result = new int[size];
        for (var i = 0; i < size; i++)
            result[i] = list.get(size - 1 - i);
        return result;
    }
}
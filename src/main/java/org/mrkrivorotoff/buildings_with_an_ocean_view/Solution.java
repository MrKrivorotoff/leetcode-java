package org.mrkrivorotoff.buildings_with_an_ocean_view;

import java.util.LinkedList;

class Solution {
    public int[] findBuildings(int[] heights) {
        final var result = new LinkedList<Integer>();
        for (int i = heights.length - 1, maxHeight = 0; i >= 0; i--) {
            final var currHeight = heights[i];
            if (currHeight > maxHeight) {
                maxHeight = currHeight;
                result.addFirst(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
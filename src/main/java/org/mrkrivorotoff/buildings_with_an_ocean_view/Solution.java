package org.mrkrivorotoff.buildings_with_an_ocean_view;

import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

class Solution {
    public int[] findBuildings(int[] heights) {
        final var result = new LinkedList<Integer>();
        for (int i = heights.length - 1, maxHeight = 0; i >= 0; i--) {
            final var currHeight = heights[i];
            if (maxHeight < currHeight) {
                maxHeight = currHeight;
                result.addFirst(i);
            }
        }
        return intListToArray(result);
    }

    private static int[] intListToArray(final List<Integer> list) {
        final var size = list.size();
        final var result = new int[size];
        if (list instanceof RandomAccess) {
            for (var i = 0; i < size; i++)
                result[i] = list.get(i);
        } else {
            int i = 0;
            for (final var item : list)
                result[i++] = item;
        }
        return result;
    }
}
package org.mrkrivorotoff;

import java.util.List;
import java.util.RandomAccess;

public final class Utils {
    private Utils() {
        throw new AssertionError();
    }

    private static int[] intListToArray(List<Integer> list) {
        var size = list.size();
        var result = new int[size];
        if (list instanceof RandomAccess) {
            for (var i = 0; i < size; i++)
                result[i] = list.get(i);
        } else {
            int i = 0;
            for (var item : list)
                result[i++] = item;
        }
        return result;
    }
}
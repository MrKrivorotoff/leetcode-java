package org.mrkrivorotoff.fizz_buzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<String> fizzBuzz(int n) {
        return fizzBuzzUsingSimpleIteration(n);
    }

    private static List<String> fizzBuzzUsingStream(final int number) {
        return IntStream
                .rangeClosed(1, number)
                .mapToObj(Solution::selectFizzBuzzOrNumber)
                .collect(Collectors.toList());
    }

    private static List<String> fizzBuzzUsingSimpleIteration(final int number) {
        final var result = new ArrayList<String>(number);
        for (var i = 1; i <= number; i++)
            result.add(selectFizzBuzzOrNumber(i));
        return result;
    }

    private static String selectFizzBuzzOrNumber(final int number) {
        final var divisibleBy3 = number % 3 == 0;
        final var divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5)
            return "FizzBuzz";
        if (divisibleBy3)
            return "Fizz";
        if (divisibleBy5)
            return "Buzz";
        return Integer.toString(number);
    }
}
package org.mrkrivorotoff.fizz_buzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        final var expected = List.of("1", "2", "Fizz");
        assertEquals(expected, solution.fizzBuzz(3));
    }

    @Test
    void example2() {
        final var expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, solution.fizzBuzz(5));
    }

    @Test
    void example3() {
        final var expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected, solution.fizzBuzz(15));
    }
}
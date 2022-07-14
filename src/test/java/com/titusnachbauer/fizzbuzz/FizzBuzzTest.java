package com.titusnachbauer.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    private final String[] list = fizzBuzz.getFizzBuzzList().split("\n");

    @Test
    void GivenFizzBuzzListWhenRetrievingFirstItemThenExpectOne() {
        assertEquals("1", list[1]);
    }

    @Test
    void GivenFizzBuzzListWhenRetrievingSecondItemThenExpectTwo() {
        assertEquals("2", list[2]);
    }

    @Test
    void GivenFizzBuzzListWhenRetrieving99thItemThenExpect99() {
        assertEquals("99", list[99]);
    }

    @Test
    void GivenFizzBuzzListWhenRetrieving100thItemThenExpect100() {
        assertEquals("100", list[100]);
    }

    @Test
    void GivenNumberWhen3ThenFizz() {
        assertEquals("Fizz", fizzBuzz.getAnswerFor(3));
    }
}

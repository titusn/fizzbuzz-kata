package com.titusnachbauer.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final String[] list = FizzBuzz.getFizzBuzzList().split("\n");
    @Test
    void GivenFizzBuzzListWhenRetrievingFirstItemThenExpectOne() {
        assertEquals("1", list[0]);
    }
    @Test
    void GivenFizzBuzzListWhenRetrievingSecondItemThenExpectTwo() {
        assertEquals("2", list[1]);
    }
}

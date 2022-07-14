package com.titusnachbauer.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void GivennoInputWhenICallFizzBuzzThenIExpectOne() {
        String list = FizzBuzz.getFizzBuzzList();
        assertEquals("1", list);
    }
}

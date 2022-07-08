package com.titusnachbauer.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void iSayOneYouSayOne(){
        assertEquals("1", FizzBuzz.getResult(1));
    }
    @Test
    void iSayThreeYouSayFizz() {
        assertEquals("Fizz", FizzBuzz.getResult(3));
    }


}

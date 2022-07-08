package com.titusnachbauer.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    private final FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    void nothingTest() {
        assertTrue(true);
    }
    @Test
    void inputOneReturnsOne() {
        String result = fizzbuzz.input(1);
        assertEquals(result,"1");
    }
    @Test
    void inputTwoReturnsTwo() {
        String result = fizzbuzz.input(2);
        assertEquals(result, "2");
    }
    @Test
    void inputThreeReturnsFizz() {
        String result = fizzbuzz.input(3);
        assertEquals(result, "Fizz");
    }
    @Test
    void iSayFiveYouSayBuzz(){
        String result = fizzbuzz.input(5);
        assertEquals(result, "Buzz");
    }
    @Test
    void iSaySixYouSayFizz(){
        String result = fizzbuzz.input(6);
        assertEquals(result, "Fizz");
    }
    @Test
    void iSayTenYouSayBuzz(){
        assertEquals("Buzz", fizzbuzz.input(10));
    }
    @Test
    void iSayFifteenYouSayFizzBuzz(){
        assertEquals("FizzBuzz", fizzbuzz.input(15));
    }
    @Test
    void iSayThirtyYouSayFizzBuzz(){
        assertEquals("FizzBuzz", fizzbuzz.input(30));
    }
}

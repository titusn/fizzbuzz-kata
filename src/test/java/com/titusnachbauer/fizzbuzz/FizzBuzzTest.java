package com.titusnachbauer.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    String[] fizzBuzzList = FizzBuzz.getFizzBuzzList().split("\n");

    @Test
    void firstFizzBuzzList(){
        String list = FizzBuzz.getFizzBuzzList();
        assertEquals("1", list.substring(1,2));

    }
    @Test
    void firstNumberFromNumberListIsOne(){
        assertEquals("1", fizzBuzzList[1]);
    }
    @Test
    void hundredthNumberFromFuzzBizzListIsBuzz(){
        assertEquals("Buzz", fizzBuzzList[100]);
    }

    @Test
    void thirdNumberFromNumberListIsFizz(){
        assertEquals("Fizz", fizzBuzzList[3]);
    }
    @Test
    void ninetyninethNumberFromNumberListIsAlsoFizz(){
        assertEquals("Fizz", fizzBuzzList[99]);
    }
    @Test
    void fifthNumberFromFizzBuzzListIsBuzz(){
        assertEquals("Buzz", fizzBuzzList[5]);
    }
    @Test
    void fifteenthNumberFromFizzBuzzListisFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzzList[15]);
    }
}

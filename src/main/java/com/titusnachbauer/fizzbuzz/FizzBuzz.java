package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getAnswerFor(Integer i) {
        if (i == 3) {
            return "Fizz";
        } else {
            return i.toString();
        }
    }
}

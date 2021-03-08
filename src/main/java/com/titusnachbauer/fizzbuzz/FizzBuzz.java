package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getAnswerFor(Integer i) {
        if (i == 3) {
            return "Fizz";
        } else if (i == 5) {
            return "Buzz";
        } else {
            return i.toString();
        }
    }
}

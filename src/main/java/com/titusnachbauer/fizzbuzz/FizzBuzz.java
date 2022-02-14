package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getAnswerFor(Integer i) {

        if (i.equals(3)) {
            return "Fizz";
        } else if (i.equals(5)) {
            return "Buzz";
        }

        return i.toString();
    }
}

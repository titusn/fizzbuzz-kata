package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getAnswerFor(Integer i) {

        if (i.equals(3)) {
            return "Fizz";
        }

        return i.toString();
    }
}

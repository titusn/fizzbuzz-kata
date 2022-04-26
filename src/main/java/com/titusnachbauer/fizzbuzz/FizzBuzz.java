package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String get(Integer i) {

        if (i % 3 == 0) {
            return "Fizz";
        } else if (i.equals(5)) {
            return "Buzz";
        }

        return i.toString();
    }
}

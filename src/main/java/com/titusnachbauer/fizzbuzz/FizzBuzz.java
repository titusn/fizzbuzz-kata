package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String input(int i) {
        String str = "";
        if (i % 3 == 0) {
            str = str.concat("Fizz");
        }
        if (i % 5 == 0) {
            str = str.concat("Buzz");
        }
        if (str.equals("")) {
            str = str.concat(Integer.toString(i));
        }
        return str;
    }
}

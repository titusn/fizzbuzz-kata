package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public static String getFizzBuzzList() {

        StringBuilder listOfNumbers = new StringBuilder();
        for(int number = 1; number <= 100; number++) {
            listOfNumbers.append("\n");
            listOfNumbers.append(number);
        }
        return listOfNumbers.toString();

    }
}

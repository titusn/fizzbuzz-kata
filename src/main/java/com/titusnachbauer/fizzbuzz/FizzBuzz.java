package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getFizzBuzzList() {

        StringBuilder listOfNumbers = new StringBuilder();
        for (int number = 1; number <= 100; number++) {
            listOfNumbers.append("\n");
            listOfNumbers.append(getAnswerFor(number));
        }
        return listOfNumbers.toString();

    }

    public String getAnswerFor(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}

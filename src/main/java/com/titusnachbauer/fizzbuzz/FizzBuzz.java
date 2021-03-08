package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {
    public String getAnswerFor(Integer i) {
        StringBuilder answer = new StringBuilder();
        if (i % 3 == 0) {
            answer.append("Fizz");
        }
        if (i % 5 == 0) {
            answer.append("Buzz");
        }
        if (answer.isEmpty()) {
            answer.append(i.toString());
        }
        return answer.toString();
    }
}

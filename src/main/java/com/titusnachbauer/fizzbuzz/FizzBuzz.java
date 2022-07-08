package com.titusnachbauer.fizzbuzz;

public class FizzBuzz {

    public static String getFizzBuzzList() {
        StringBuilder list = new StringBuilder();
        for(int i = 1; i <=100; i++){
            if (i % 15 == 0) {
                list.append("\nFizzBuzz");
            } else if (i % 3 == 0){
                list.append("\nFizz");
            } else if (i % 5 == 0){
                list.append("\nBuzz");
            } else {
                list.append("\n").append(Integer.valueOf(i).toString());
            }
        }
        return list.toString();
    }
}

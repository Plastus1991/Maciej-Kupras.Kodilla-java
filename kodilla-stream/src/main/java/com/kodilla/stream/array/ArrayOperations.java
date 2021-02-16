package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

     static double getAverage(int[] numbers) {

         IntStream intStream = IntStream.of(numbers);
         intStream.forEach(System.out::println);

        double result = IntStream.of(numbers).average().getAsDouble();

        return result;

     }
}

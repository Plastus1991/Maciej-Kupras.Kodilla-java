package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new LinkedList<>();
        for(int i : numbers) {
            if(i%2 == 0) {
                evenNumbers.add(i);
            }
        }
       return evenNumbers;
    }
}

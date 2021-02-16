package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.LinkedList;

public class TestingMain {
    public static void main(String[] args) {
        LinkedList<Integer> all = new LinkedList<>();
        all.add(2);
        all.add(3);
        all.add(5);
        all.add(6);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        System.out.println(exterminator.exterminate(all));



    }
}

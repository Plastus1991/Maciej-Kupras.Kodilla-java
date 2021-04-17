package com.kodilla.practise1;

public class Calculator {

    public static void main(String[] args) throws java.lang.Exception {

        int table[] = new int[20];

        for (int i = 0; i < table.length; i++) {
            table[i] = i + 1;
            System.out.println(table[i]);
        }
        System.out.println("sum of numbers = " + sumUp(table));
        System.out.println("average = " + Calculator.average(table));
    }

    public static double sumUp(int table[]) {
        double sum = 0;

        for (int number : table) {
            sum += number;
        }
        return sum;
    }

    public static double average(int tab[]) {

        double sum = Calculator.sumUp(tab);
        double average;
        return average = sum / tab.length;

    }
}

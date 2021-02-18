package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[])  {

        SecondChallenge secondChallenge = new SecondChallenge();

             try {
                 secondChallenge.probablyIWillThrowException(2, 1.5);
             } catch (Exception e) {
                 System.out.println("Loop problem");
             } finally {
                 System.out.println("I am gonna be here... always!");
             }

    }
}

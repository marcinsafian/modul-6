package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "Nothing";
        try {
            result = secondChallenge.probablyIWillThrowException(0.5, 1);
        } catch (Exception e) {
            System.out.println("Exception-> " + e);
        } finally {
            System.out.println(result);
        }
    }

}

package com.kodilla.testing;
import com.kodilla.testing.calculator.SimpleCalculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int sum =6;

        int addSum = simpleCalculator.add(3,3);

        if (sum==addSum){
            System.out.println("Test dodawania OK");
        }else{
            System.out.println("Błąd dodawania");
        }
        int sub = simpleCalculator.subtract(12,6);

        if (sum==sub){
            System.out.println("Test odejmowania OK");
        }else{
            System.out.println("Błąd odejmowania");
        }
        //miejsce na kolejne testy
    }
}

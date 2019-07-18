package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.reference.PoemBeautifierReference;
import com.kodilla.stream.beautifier.reference.PoemExecutor;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");

        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::subBFromA);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tapped using small letters",(m)->m.toUpperCase());
        poemBeautifier.beautify("TAPPED using CAPITAL LETTERS", (m)->m.toLowerCase());
        poemBeautifier.beautify("Lorem ipsum dolor sit amet.",(m)->m.replace('m','Z'));

        PoemExecutor poemExecutor = new PoemExecutor();
        poemExecutor.executeBeauti("Lorem ipsum",PoemBeautifierReference::doSth);

    }

}
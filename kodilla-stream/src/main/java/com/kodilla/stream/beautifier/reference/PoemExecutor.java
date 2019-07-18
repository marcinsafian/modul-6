package com.kodilla.stream.beautifier.reference;

import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemExecutor {
    public void executeBeauti(String x, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(x);
        System.out.println(x+ " long for: " + result+" characters");
    }
}

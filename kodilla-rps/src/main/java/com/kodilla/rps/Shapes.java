package com.kodilla.rps;

public enum Shapes {
    STONE("stone"),PAPER("paper"),SCISSORS("scissors");

    private final String text;

    Shapes(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
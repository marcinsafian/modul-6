package com.kodilla.rps;

public class Generator {
    private Shapes shapesGenerated;

    public Shapes shapesGenerated(Shapes userShape){
        switch (userShape){
            case STONE:
                shapesGenerated = Math.random() < 0.5 ? Shapes.PAPER : (Math.random() >= 0.5 && Math.random()<0.75 ? Shapes.SCISSORS : Shapes.STONE);
            case PAPER:
                shapesGenerated = Math.random() < 0.25 ? Shapes.PAPER : (Math.random() >= 0.25 && Math.random()<0.75 ? Shapes.SCISSORS : Shapes.STONE);
            case SCISSORS:
                shapesGenerated = Math.random() < 0.25 ? Shapes.PAPER : (Math.random() >= 0.25 && Math.random()<0.05 ? Shapes.SCISSORS : Shapes.STONE);
        }
        return shapesGenerated;
    }
}

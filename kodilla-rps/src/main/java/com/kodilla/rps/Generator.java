package com.kodilla.rps;

public class Generator {
    private Shapes shapesGenerated;

    public Shapes getShapesGenerated(Shapes userShape){
        switch (userShape){
            case STONE:
                shapesGenerated = Math.random() < 0.5 ? Shapes.PAPER : (Math.random() >= 0.5 && Math.random()<0.75 ? Shapes.SCISSORS : Shapes.STONE);
        }
        return null;
    }
}

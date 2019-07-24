package com.kodilla.rps;

import java.util.Scanner;

class Rps {

    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private int roundsOfGame;
    private int gameRound=0;
    private String userPlayerRoung;
    private boolean end = false;
    Shapes userShape, comShape;

    public boolean run(UserInterface userInterface, Scanner scanner, String playerName) {
        userInterface.numberOfRoundsYouPlay(playerName);
        Validate validate = new Validate();
        do {
            roundsOfGame = validate.number(scanner.nextLine());
            if (roundsOfGame==0) {
                userInterface.errorRoundValue();
            }
            }while (roundsOfGame==0);
        userInterface.rulesOfGame();

        Generator generator = new Generator();

        while (gameRound<roundsOfGame){
            gameRound++;
                userPlayerRoung = validate.gameImput(scanner.nextLine(),scanner,userInterface);
                switch (userPlayerRoung){
                    case EXIT:
                        end = true;
                        break;
                    case NEW_GAME:
                        gameRound = roundsOfGame;
                        break;
                        default:
                            userShape = Shapes.valueOf(userPlayerRoung.toLowerCase());
                            comShape = generator.shapesGenerated(userShape);
                            userInterface.roundResult(userShape,comShape);

                }
        }
        return false;
    }
}



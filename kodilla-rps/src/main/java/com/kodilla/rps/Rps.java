package com.kodilla.rps;

import java.util.Scanner;

class Rps {

    private static final String EXIT = "x";
    private static final String NEW_GAME = "n";
    private int roundsOfGame;
    int gameRound=0;
    private int userScor =0;
    private int compScore =0;
    private String userPlayerRound;
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
                userPlayerRound = validate.gameImput(scanner.nextLine(),scanner,userInterface);
                switch (userPlayerRound){
                    case EXIT:
                        end = true;
                        gameRound=roundsOfGame;
                        break;
                    case NEW_GAME:
                        gameRound = roundsOfGame;
                        break;
                        default:
                            userShape = Shapes.valueOf(userPlayerRound.toLowerCase());
                            comShape = generator.shapesGenerated(userShape);
                            userInterface.roundResult(userShape,comShape);
                            if(!userShape.equals(comShape)){
                                if (userShape.equals(Shapes.STONE)&&comShape.equals(Shapes.SCISSORS)||userShape.equals(Shapes.SCISSORS)&&comShape.equals(Shapes.PAPER)||userShape.equals(Shapes.PAPER)&&comShape.equals(Shapes.STONE)){
                                    userScor++;
                                    userInterface.winMesageUser(playerName,userScor,compScore);
                                }else {
                                    compScore++;
                                    userInterface.winMesageUser(playerName, userScor, compScore);
                                }
                                }else {
                                userInterface.quitMessage();
                            }


                }
        }
        return false;
    }
}



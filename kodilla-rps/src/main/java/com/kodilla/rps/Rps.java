package com.kodilla.rps;

import java.util.Scanner;

class Rps {

    private int roundsOfGame;

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
        return true;
    }
}



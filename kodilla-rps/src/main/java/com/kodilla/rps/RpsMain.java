package com.kodilla.rps;

import java.util.Scanner;

class RpsMain {
    public boolean run(UserInterface userInterface, Scanner scanner,String playerName){
        userInterface.numberOfRoundsYouPlay(playerName);
        return true;
    }

}

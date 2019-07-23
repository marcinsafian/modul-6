package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        userInterface.helloMessage();
        String playerName = scanner.nextLine();
        while (!exit){
            RpsMain rpsMain = new RpsMain();
            exit = rpsMain.run(userInterface,scanner,playerName);
        }
    }
}

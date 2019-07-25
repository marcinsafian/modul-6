package com.kodilla.rps;
import java.util.Scanner;


public class RpsRunner {
    public static void main(String[] args){
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        userInterface.helloMessage();
        String playerName = scanner.nextLine();
        while (!end){
            Rps rps = new Rps();
            end = rps.run(userInterface,scanner,playerName);
        }
    }
}

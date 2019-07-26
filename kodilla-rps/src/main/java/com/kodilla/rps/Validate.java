package com.kodilla.rps;

import java.util.Scanner;
import static com.kodilla.rps.Shapes.*;

public class Validate {
    private static final String CHOICE_1 = "1";
    private static final String CHOICE_2 = "2";
    private static final String CHOICE_3 = "3";
    private static final String NEW_GAME = "n";
    private static final String END = "x";
    private static final String YES = "y";

    public int number(String rounds) {
        int d = Integer.parseInt(rounds);
        boolean x = Character.isDigit(d);

            if (rounds.isEmpty()) {
                return 0;
            } else {
                return Integer.parseInt(rounds);
            }
    }
    public String gameImput(String input, Scanner scanner, UserInterface userInterface){
        while (true){
         switch (input){
             case CHOICE_1:
                 return String.valueOf(STONE);
             case CHOICE_2:
                 return String.valueOf(PAPER);
             case CHOICE_3:
                 return String.valueOf(SCISSORS);
             case END:
                 userInterface.quitMessage();
                 input = scanner.nextLine();
                 if(input.toLowerCase().equals(YES)){
                     return END;
                 }
                 break;
             case NEW_GAME:
                 userInterface.newGame();
                 input = scanner.nextLine();
                 if(input.toLowerCase().equals(YES)){
                     return NEW_GAME;
                 }
                 break;
                 default:
                     userInterface.incorrectImput();
                     input = scanner.nextLine();
         }
        }
    }
    public String endGame(String input, Scanner scanner,UserInterface userInterface){
        while (true){
            switch (input){
                case END:
                    userInterface.endMessage();
                    input = scanner.nextLine();
                    if (input.toLowerCase().equals(YES)){
                        return END;
                    }
                    break;
                case NEW_GAME:
                    userInterface.continueGame();
                    input = scanner.nextLine();
                    if (input.toLowerCase().equals(YES)){
                        return NEW_GAME;
                    }
                    break;
                default:
                    userInterface.incorrectEnd();
                    input = scanner.nextLine();
            }
        }

    }

}

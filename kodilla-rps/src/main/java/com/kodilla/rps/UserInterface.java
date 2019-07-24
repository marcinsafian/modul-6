package com.kodilla.rps;

public class UserInterface {
    public void helloMessage(){
        System.out.println("Welcome. Let`s play...\n What is Your name");
    }
    public void numberOfRoundsYouPlay(String playerName){
        System.out.println("How many rounds you wish to play "+playerName+" ?");
    }
    public void errorRoundValue(){
        System.out.println("Incorrect numbers of round");
    }
    public void rulesOfGame(){
        System.out.println("Book of rules");
        System.out.println("menu:\n'1' - take \"stone\""+"\n"+"'2' - take \"paper\""+"\n"+"'3' - take \"scissors\""+
                "\n"+"'x' - quit game"+"\n"+"'n' - reset and start new game");
    }
}

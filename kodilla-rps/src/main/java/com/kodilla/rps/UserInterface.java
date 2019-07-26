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
    public void quitMessage(){
        System.out.println("Do you really go out (Y/N)");
    }
    public void newGame(){
        System.out.println("Great! New game. Let`s play (Y/N)");
    }
    public void incorrectImput(){
        System.out.println("Use only: '1'; '2'; '3'; 'n' or 'x' ");
    }
    public void roundResult(Shapes userShape, Shapes compShape){
        System.out.println("you:   ------ vs -----  : copmuter \n" + userShape +" vs " +compShape);
    }
    public void winMesageUser(String playerName, int userScore, int compScore){
        System.out.println(" You wins!"+" "+ playerName+ " "+userScore+" : "+compScore);
    }
    public void winMesageComputer(String playerName, int userScore, int compScore){
        System.out.println("Loser! Computer wins!"+" "+playerName+" "+userScore+ " : "+compScore);
    }public void draw(String playerName, int userScore, int compScore){
        System.out.println("It`s draw! "+ userScore);
    }
    public void scoresDisplay(int userScore, int compScore){
        System.out.println("-------------------------------------------------"+
                "\nGAME OVER!"+"\n You have won: "+userScore+" "+"Computer has won: "+compScore);
        System.out.println("\n Would you like try one more time? \n'n' - start new game\n 'x' - EXIT");
    }
    public void endMessage(){
        System.out.println("Koniec?");
    }
    public void continueGame(){
        System.out.println("Grasz dalej");
    }
    public void incorrectEnd(){
        System.out.println("Coś nie pykło");
    }
}

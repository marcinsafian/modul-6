package com.kodilla.rps;

public class Validate {
    public int number(String rounds){
    if (rounds.trim().isEmpty()){
        return 0;

    }else {
        return Integer.parseInt(rounds);
        }
    }
}

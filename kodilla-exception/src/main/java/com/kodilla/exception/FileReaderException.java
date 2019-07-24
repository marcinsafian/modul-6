package com.kodilla.exception;

import com.kodilla.exception.io.FileReader;

public class FileReaderException extends Exception {
    public static void main(String[]args) {

        FileReader fileReader = new FileReader();
        try{
            fileReader.readFile();
        }catch (FileReaderException e){
            System.out.println("Problem..."+e);
        }
    }
}

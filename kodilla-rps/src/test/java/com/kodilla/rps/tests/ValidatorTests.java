package com.kodilla.rps.tests;

import com.kodilla.rps.UserInterface;
import com.kodilla.rps.Validate;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class ValidatorTests {
    private Validate validate;
    private Scanner scanner;
    private UserInterface userInterface;
    @Before
    public void setUp(){
        validate = new Validate();
        scanner = new Scanner("Y");
        userInterface = new UserInterface();
    }

   @Test
    public void testStoneInput(){
       assertEquals("STONE",validate.gameImput("1",scanner,userInterface));
   }
    @Test
    public void testPaperInput(){
        assertEquals("PAPER",validate.gameImput("2",scanner,userInterface));
    }
    @Test
    public void testScissorsInput(){
        assertEquals("SCISSORS",validate.gameImput("3",scanner,userInterface));
    }
    @Test
    public void testExitGame(){
       assertEquals("x",validate.gameImput("x",scanner,userInterface));
    }
    @Test
    public void testNewGameContinue(){
       assertEquals("x",validate.gameImput("x",scanner,userInterface));
    }
    @Test
    public void testEndGameAndNewOne(){
       assertEquals("n",validate.endGame("n",scanner,userInterface));
    }
    @Test
    public void testEndGameAndExit(){
       assertEquals("x",validate.endGame("x",scanner,userInterface));
    }
}

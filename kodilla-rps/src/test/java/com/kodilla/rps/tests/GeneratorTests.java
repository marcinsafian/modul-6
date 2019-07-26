package com.kodilla.rps.tests;

import com.kodilla.rps.Generator;
import com.kodilla.rps.Shapes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.kodilla.rps.Shapes.STONE;

public class GeneratorTests {
    Shapes userShape,shapesGenerated;
    Generator generator;
    int paperCount,scissorsCount,stoneCount;
    @Before
    public void setUp(){
        paperCount = scissorsCount = stoneCount = 0;
        generator = new Generator();
    }
    @Test
    public void testGeneratorMadeStone(){
        //Given
        userShape = STONE;
        //When
        for (int i =0; i<100; i++){

            switch (generator.shapesGenerated(userShape)){
                case PAPER:
                    paperCount++;
                    break;
                case STONE:
                    stoneCount++;
                    break;
                case SCISSORS:
                    scissorsCount++;
                    break;
            }
            //Then
            Assert.assertTrue(Math.abs(paperCount-(stoneCount+scissorsCount))<100);
        }
    }
}
package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector;

    @Before
            public void beforeTest(){
         shapeCollector = new ShapeCollector();
    }

   @Test
   public  void testAddFigure(){
        //Given
       Shape shape = new Square(4);
       //When
       shapeCollector.addFigure(shape);
       //Then
       Assert.assertEquals(1, shapeCollector.getShapeCollection().size());

   }

    @Test
    public void testRemoveFigure(){

        //Given
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
       shapeCollector.removeFigure(shape);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigureWhichDoesNotExist(){

        //Given
        shapeCollector.addFigure(new Square(5));
        //When
        boolean result = shapeCollector.removeFigure(new Square(4));
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testGetFigureExistNumber(){

        //Given
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, shapeResult);
    }

    @Test
    public void testGetFigureNumberOutOfRange(){

        //Given
        //ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        Assert.assertNull(shapeResult);
    }
    @Test
    public void testShowFigures(){

        //Given
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        Assert.assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}
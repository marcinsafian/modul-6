package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers[]={1,2,3,4,5,6,7,8,9,0};

        //When
        double aver = ArrayOperations.getAverage(numbers);

        //Then
        double expAver = 4.5;
        Assert.assertEquals(expAver,aver,0.0001);

    }
}

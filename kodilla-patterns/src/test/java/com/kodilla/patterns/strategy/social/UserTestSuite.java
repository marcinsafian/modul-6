package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenials = new Millenials("Nancy");
        User yGeneration = new YGeneration("Tod");
        User zGeneration = new ZGeneration("Alice");
        //When
        String snapchat = millenials.sharePost();
        String faceBook = yGeneration.sharePost();
        String twitter = zGeneration.sharePost();
        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Facebook", faceBook);
        Assert.assertEquals("Twitter", twitter);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("Nancy");
        millenials.setSocialPublisher(new FacebookPublisher());
        //When
        String faceBook = millenials.sharePost();
        //Then
        Assert.assertEquals("Facebook",faceBook);
    }
}

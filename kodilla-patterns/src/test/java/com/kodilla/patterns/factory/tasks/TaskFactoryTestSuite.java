package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testMakeShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING, "shopping list", "potato", "2.5");
        boolean before = shopping.isTaskExecuted();
        shopping.executeTask();
        //Then
        Assert.assertEquals("shopping list", shopping.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING, "painting list", "blue", "nothing");
        boolean before = painting.isTaskExecuted();
        painting.executeTask();
        //Then
        Assert.assertEquals("painting list", painting.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING, "driving list", "no where", "bike");
        boolean before = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assert.assertEquals("driving list", driving.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(driving.isTaskExecuted());

    }

    @Test
    public void testNullTask() {
        TaskFactory taskFactory = new TaskFactory();
        Task nullTask = taskFactory.makeTask("Null",
                "My null task", "", "");
        Assert.assertNull(nullTask);

    }
}

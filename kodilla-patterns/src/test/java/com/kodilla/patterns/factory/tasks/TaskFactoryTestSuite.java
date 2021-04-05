package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.getTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Go to buy", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.getTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Beauty color", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }
    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.getTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Go to travel", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

}

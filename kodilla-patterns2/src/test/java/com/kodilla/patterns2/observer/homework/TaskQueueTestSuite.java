package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    void testUpdate() {

        //Given
        TaskQueue taskQueue1 = new TaskQueue("List1");
        TaskQueue taskQueue2 = new TaskQueue("List2");

        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);

        //Then
        taskQueue1.addTask("Task1");
        taskQueue1.addTask("Task2");
        taskQueue1.addTask("Task3");

        taskQueue2.addTask("Task4");
        taskQueue2.addTask("Task5");

        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}

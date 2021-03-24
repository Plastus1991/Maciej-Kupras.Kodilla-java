package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component
public class Board {
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;



    public TaskList getInProgressList() {
        return inProgressList;
    }


    public void getDoneList() {
        System.out.println("Progress List");
    }

    public void getToDoList() {
        System.out.println("Done");
    }
}

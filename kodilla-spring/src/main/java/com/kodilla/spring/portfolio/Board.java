package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void getInProgressList() {
        System.out.println("To do List");
    }

    public void getDoneList() {
        System.out.println("Progress List");
    }

    public void getToDoList() {
        System.out.println("Done");
    }
}

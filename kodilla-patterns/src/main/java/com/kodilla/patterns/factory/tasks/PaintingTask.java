package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPain;

    public PaintingTask(String taskName, String color, String whatToPain) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPain = whatToPain;
    }

    @Override
    public void executeTask() {
        System.out.println(whatToPain);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(color.equals("Blue")) {
            executeTask();
            return true;
        } else {
            return false;
        }
    }
}

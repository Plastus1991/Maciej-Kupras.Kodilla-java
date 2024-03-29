package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(username + " New tasks in list " + taskQueue.getName() + "\n" +
                "total tasks: " + taskQueue.getTasks().size());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

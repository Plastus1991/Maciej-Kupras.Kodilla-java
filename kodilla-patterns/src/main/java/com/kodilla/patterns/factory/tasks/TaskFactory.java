package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task getTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Go to travel" , "To Sea", "car");
            case PAINTING:
                return new PaintingTask("Beauty color", "red", "wall");
            case SHOPPING:
                return new ShoppingTask("Go to buy", "bike", 12);
            default:
                return null;
        }
    }
}

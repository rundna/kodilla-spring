package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Tasks makeTasks(final String task){
        switch(task){
            case DRIVING: return new DrivingTask("Riders on the storm","Route 66","JM Car");
            case PAINTING: return new PaintingTask("Paint it black","Black","Door");
            case SHOPPING: return new ShoppingTask("Pink Floyd's amazon song","Money",2.0);
            default: return null;
        }
    }


}

package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksTestSuite {

    @Test
    public void testTaskExecutionStatus(){
        //DrivingTask dTask = new DrivingTask("Route 1","Gdynia","Car");
        //boolean result = dTask.isTaskExecuted(dTask);
        //System.out.println(result);

        TaskFactory task = new TaskFactory();
        Tasks driving = task.makeTasks(TaskFactory.DRIVING);
        driving.executeTask();
        boolean result = driving.isTaskExecuted();

        Assert.assertEquals(true,result);

    }
    @Test
    public void testTaskName(){
        TaskFactory task = new TaskFactory();
        Tasks painting = task.makeTasks(TaskFactory.PAINTING);
        Assert.assertEquals("Paint it black",painting.getTaskName());
    }

    @Test
    public void testTaskExecution(){
        TaskFactory task = new TaskFactory();
        Tasks shoping = task.makeTasks(TaskFactory.SHOPPING);
        Assert.assertEquals("Task type: Pink Floyd's amazon song to buy Money in amount of 2.0", shoping.executeTask());

    }
}

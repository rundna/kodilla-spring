package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TasksTestSuite {

    @Test
    public void testTaskExecutionStatus(){
        //DrivingTask dTask = new DrivingTask("Route 1","Gdynia","Car");
        //boolean result = dTask.isTaskExecuted(dTask);
        //System.out.println(result);

        TaskFactory taskFactory = new TaskFactory();
        Tasks task = taskFactory.makeTasks(TaskFactory.DRIVING);
        task.executeTask();
        boolean result = task.isTaskExecuted();

        Assert.assertEquals(true,result);

    }
    @Test
    public void testTaskName(){
        TaskFactory taskFactory = new TaskFactory();
        Tasks task = taskFactory.makeTasks(TaskFactory.PAINTING);
        task.executeTask();
        Assert.assertTrue(task.executeTask().contains("Paint it black"));
        Assert.assertEquals("Paint it black",task.getTaskName());
    }

    @Test
    public void testTaskExecution(){
        TaskFactory taskFactory = new TaskFactory();
        Tasks task = taskFactory.makeTasks(TaskFactory.SHOPPING);
        Assert.assertEquals("Task type: Pink Floyd's amazon song to buy Money in amount of 2.0", task.executeTask());

    }
}

package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Tasks{

    private String taskName;
    private String where;
    private String using;
    private boolean execute=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String executeTask(){
        execute = true;
        return "Task type: " + this.taskName + "to " + this.where + " using " + this.using;
    }
    @Override
    public String getTaskName(){
       return this.taskName;
    }
    @Override
    public boolean isTaskExecuted(){
    return execute;}
}

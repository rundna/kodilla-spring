package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Tasks{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean execute=false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String executeTask(){
        this.execute = true;
        return "Task type: " + this.taskName + "with color " + this.color + " to paint " + this.whatToPaint;
    }
    @Override
    public String getTaskName(){
        return this.taskName;
    }
    @Override
    public boolean isTaskExecuted(){
        return execute;}
}

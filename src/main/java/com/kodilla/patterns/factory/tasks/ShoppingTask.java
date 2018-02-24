package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Tasks{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private static Tasks sTask = null;
    private boolean execute = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask(){
        return "Task type: " + this.taskName + " to buy " + this.whatToBuy + " in amount of " + this.quantity;
    }
    @Override
    public String getTaskName(){
        return this.taskName;
    }
    @Override
    public boolean isTaskExecuted(Tasks sTask){
        if(sTask!=null){
            execute = true;
        }
        return execute;}
}

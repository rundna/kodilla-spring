package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String item) {
        tasks.add(item);
    }
    public int getSize(){
        return tasks.size();
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}

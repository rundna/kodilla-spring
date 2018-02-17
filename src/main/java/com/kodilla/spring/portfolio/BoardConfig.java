package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("ToDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("InProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("DoneList")
    private TaskList doneList;

    @Bean(name="ToDoList")
    @Scope("prototype")
    public TaskList addToDoList(){
        return new TaskList();
    }

    @Bean(name="InProgressList")
    @Scope("prototype")
    public TaskList addInProgressList(){
        return new TaskList();
    }

    @Bean(name="DoneList")
    @Scope("prototype")
    public TaskList addDoneList(){
        return new TaskList();
    }
    @Bean(name="CreateBoard")
    public Board createBoard(){
        return new Board(toDoList,inProgressList,doneList);
    }
}

package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKSLIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }
    @Column(name="DESCRIPTION")
    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    public TaskList(){}

    public TaskList(String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "listName='" + listName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

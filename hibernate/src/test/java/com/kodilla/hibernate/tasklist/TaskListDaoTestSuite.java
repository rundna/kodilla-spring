package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String TASKNAME = "First Task";

    @Test
    public void testFindByListName() {
        TaskList task = new TaskList(TASKNAME,"My first task");
        taskListDao.save(task);

        List<TaskList> taskClone = taskListDao.findByListName("First Task");


        //System.out.println(task.toString());
        Assert.assertEquals(1, taskClone.size());

        //taskListDao.deleteAll();
    }
}







package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTask(){

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        Board board = context.getBean(Board.class);
        board.getDoneList().add("Task done");
        board.getDoneList().add("Task done2");
        board.getInProgressList().add("Never done list");
        board.getToDoList().add("Finally done list");

        System.out.println(board.toString());
        Assert.assertEquals(2,board.getDoneList().getSize());
        Assert.assertEquals(1,board.getInProgressList().getSize());
        Assert.assertEquals(1,board.getToDoList().getSize());





    }
}

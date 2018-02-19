package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLastLog(){
        Logger loger = Logger.getInstance();
        loger.log("Test");
        String log = Logger.getInstance().getLastLog();
        Assert.assertEquals("Test",log);

    }
    @Test
    public void testInstance(){
        Logger loger = Logger.getInstance();
        loger.log("Test");
        Logger loger2 = Logger.getInstance();
        Assert.assertEquals(loger,loger2);
    }

}

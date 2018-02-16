package com.kodilla.spring.calculator;
import java.lang.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = (Calculator) context.getBean("calculator");
        //When
        double sum = calc.add(2,3);
        double sub = calc.sub(10,2);
        double mul = calc.mul(3,4);
        double div = calc.div(16,3);
        //Then
        Assert.assertEquals(5, sum,0.01);
        Assert.assertEquals(8, sub,0.01);
        Assert.assertEquals(12, mul,0.01);
        Assert.assertEquals(5.33, div,0.01);
    }
}

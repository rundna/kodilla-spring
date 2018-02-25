package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacTaste(){
        BigMac bigmac = new BigMac.BigMacBuilder()
                                    .roll("roll with sesame")
                                    .burgers("double heart stroke beef")
                                    .sauce("1000 island double dip")
                                    .ingredients("pickled cucumber")
                                    .ingredients("tomato")
                                    .ingredients("double cheese")
                                    .ingredients("lettuce leaves")
                                    .ingredients("onion")
                                    .build();
        System.out.println(bigmac);
        Assert.assertEquals(5,bigmac.getIngredients().size());
    }
    @Test
    public void testBigMacWithoutSauce(){
        BigMac bigmac = new BigMac.BigMacBuilder()
                .roll("roll with sesame")
                .burgers("double heart stroke beef")
                //.sauce("1000 island double dip")
                .ingredients("pickle")
                .ingredients("tomato")
                .ingredients("double cheese")
                .ingredients("lettuce leaves")
                .ingredients("onion")
                .build();
        System.out.println(bigmac);
        Assert.assertTrue(bigmac.getSauce()==null);
    }
}

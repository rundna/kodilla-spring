package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
         Millenials mil = new Millenials("John Stuart Mill");
         YGeneration ygrek = new YGeneration("John Smith");
         ZGeneration zet = new ZGeneration("Ludwig von Mises");

         Assert.assertEquals("Let's face IT!",mil.social.share());
         Assert.assertEquals("Twit my twit!",ygrek.social.share());
         Assert.assertEquals("Snap my chat!",zet.social.share());
    }

    @Test
    public void testIndividualSharingStrategy(){
        ZGeneration zet = new ZGeneration("Ludwig von Mises");

        System.out.println(zet.social.share());
        zet.setSocial(new TwitterPublisher());
        System.out.println(zet.social.share());

        Assert.assertEquals("Twit my twit!",zet.social.share());
    }
}

package com.kodilla.patterns.strategy.social;

public class User {
    final private String username;
    protected SocialPublisher social;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sharePost(){
        this.social.share();
    }
    public void setSocial(SocialPublisher socialPublisher){
        this.social = socialPublisher;
    }
}

package com.kodilla.spring.forum;
import java.lang.String;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;


    public ForumUser(String username){
        this.username = "John Smith";
    }


    public String getUsername() {
        return username;
    }

}

package com.example.learnJava.Profile.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class NoSQLConnection {

    @Value("${profile.userName}")
    String userName;

    @Value("${profile.userPassword}")
    String userPassword;

    @PostConstruct
    public void init(){
        System.out.println("NoSQL Connection: "+ "userName: " + userName + " userPassword: " + userPassword);
    }
}

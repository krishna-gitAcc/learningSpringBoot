package com.example.learnJava.Profile.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLConnection {

    @Value("${profile.userName}")
    String userName;

    @Value("${profile.userPassword}")
    String userPassword;

    @PostConstruct
    public void init(){
        System.out.println("MySqlConnection: "+ "userName: " + userName + " userPassword: " + userPassword);
    }
}

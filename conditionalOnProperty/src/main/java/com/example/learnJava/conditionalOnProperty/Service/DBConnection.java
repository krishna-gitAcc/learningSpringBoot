package com.example.learnJava.conditionalOnProperty.Service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class DBConnection {
    @Autowired(required = false)
    MySqlConnection mySqlConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init(){
        System.out.println("DB connection Bean created with dependencies below:");
        System.out.println("is MyConnection object null: " + Objects.isNull(mySqlConnection));
        System.out.println("is MyConnection object null: " + Objects.isNull(noSqlConnection));
    }
}

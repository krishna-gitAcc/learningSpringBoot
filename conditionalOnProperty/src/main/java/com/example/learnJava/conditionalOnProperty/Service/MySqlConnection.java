package com.example.learnJava.conditionalOnProperty.Service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "mySqlConnection", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MySqlConnection {
    MySqlConnection(){
        System.out.println("initialization of MySqlConnection bean");
    }
}

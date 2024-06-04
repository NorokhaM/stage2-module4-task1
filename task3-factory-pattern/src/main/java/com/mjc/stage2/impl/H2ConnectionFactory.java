package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class H2ConnectionFactory implements ConnectionFactory {

    public Connection createConnection(){
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}


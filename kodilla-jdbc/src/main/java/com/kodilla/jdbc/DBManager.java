package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {
    private Connection conn;
    private static DBManager dbManagerInstance;

    private DBManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user2");
        //connectionProps.put("password", "kodilla_password");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }

    public static DBManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DBManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}

package com.qcrrm.mybatissqlitedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class InitTable {

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        try {
            Class.forName("org.sqlite.JDBC");
            DriverManager.registerDriver(new org.sqlite.JDBC());
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/test.db");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS user (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)");
            statement.executeUpdate("INSERT INTO user (name, age) VALUES ('Alice', 25)");
            statement.executeUpdate("INSERT INTO user (name, age) VALUES ('Bob', 30)");
            statement.executeUpdate("INSERT INTO user (name, age) VALUES ('Charlie', 35)");
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
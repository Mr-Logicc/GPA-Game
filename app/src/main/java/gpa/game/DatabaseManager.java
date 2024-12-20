/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

/**
 *
 * @author ahmed
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static volatile DatabaseManager instance;
    private Connection connection;
    private static final String DATABASE_URL = "jdbc:sqlite:leaderboard.db";

    private DatabaseManager() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public static synchronized DatabaseManager getInstance() {
        DatabaseManager result = instance;
        if (result == null) {
            synchronized (DatabaseManager.class){
                result = instance;
                if (result == null) {
                    instance = result = new DatabaseManager();
                }
            }
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DATABASE_URL);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error reopening the database connection!", e);
        }
        return connection;
    }
    
    public synchronized void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Leaderboard {
    
    private static List<LeaderboardObserver> observers = new ArrayList<>();
    
    
    public static void addObserver(LeaderboardObserver observer) {
        observers.add(observer);
    }

    public static void removeObserver(LeaderboardObserver observer) {
        observers.remove(observer);
    }

    private static void notifyObservers() {
        for (LeaderboardObserver observer : observers) {
            observer.update();
        }
    }
    
    
    public static void addScore(String name, int score) {
        String insertSQL = "INSERT INTO leaderboard (name, score) VALUES (?, ?)";

        try (Connection conn = DatabaseManager.getInstance().getConnection();
            PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();

            notifyObservers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static List<String> getTopScores() {
        List<String> topScores = new ArrayList<>();
        String selectSQL = "SELECT name, score FROM leaderboard ORDER BY score DESC LIMIT 10";

        try (Connection conn = DatabaseManager.getInstance().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                topScores.add(rs.getString("name") + ": " + rs.getInt("score"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return topScores;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpa.game;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ahmed
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("GPA Game");
        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        // Create screens
        MainMenu mainMenu = new MainMenu(frame, cardLayout, cards);
        LeaderboardScreen leaderboardScreen = new LeaderboardScreen(cardLayout, cards);
        Game gameScreen = new Game(frame, cardLayout, cards);

        // Add screens to the CardLayout
        cards.add(mainMenu, "MainMenu");
        cards.add(leaderboardScreen, "Leaderboard");
        cards.add(gameScreen, "Game");

        // Configure the frame
        frame.add(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        // Show the main menu initially
        new StateManager().MainState(cardLayout, cards);
    } 
}

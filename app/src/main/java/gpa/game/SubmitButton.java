/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class SubmitButton implements State {
    int score;
    String playerName;
    GameOverScreen gameOverScreen;
    
    public SubmitButton(int score, GameOverScreen gameOverScreen, String playerName , CardLayout layout, JPanel cards){
        this.score = score;
        this.gameOverScreen = gameOverScreen;
        this.playerName = playerName;
        excute( layout , cards );
    }
    
    @Override
    public void excute(CardLayout layout, JPanel cards) {
        //String playerName = nameField.getText();
        Leaderboard.addScore(this.playerName, this.score);
        layout.show(cards, "MainMenu");
        gameOverScreen.dispose();
        
    }
    
}

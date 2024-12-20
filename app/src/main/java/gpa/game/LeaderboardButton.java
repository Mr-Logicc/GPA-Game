/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dohaibrahim
 */
public final class LeaderboardButton implements State{
    public LeaderboardButton(CardLayout layout , JPanel cards){
        excute(layout , cards);
    }
    @Override
    public void excute(CardLayout layout , JPanel cards) {
        LeaderboardScreen scorePanel = (LeaderboardScreen) cards.getComponent(1);
        scorePanel.refreshLeaderboard();
        layout.show( cards, "Leaderboard");
    }
    
}
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

public final class StartButton implements State{
    //CardLayout layout  JPanel cards
    public StartButton( CardLayout layout, JPanel cards){
        excute(layout , cards);
    }
    @Override
    public void excute(CardLayout layout , JPanel cards ) {
       Game gamePanel = (Game) cards.getComponent(2);
        gamePanel.initGame();
        layout.show(cards, "Game");
        gamePanel.requestFocusInWindow();  
    }
}


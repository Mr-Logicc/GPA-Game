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
public final class MainMenuState implements State{
    public MainMenuState (CardLayout layout, JPanel cards){
        excute(layout , cards);
    }
    @Override
    public void excute(CardLayout layout, JPanel cards) {
        layout.show(cards, "MainMenu");
    }
    
}

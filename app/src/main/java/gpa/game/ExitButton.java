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

public final class ExitButton implements State{
    public ExitButton(CardLayout layout , JPanel cards){
        excute(layout , cards);
    }
    @Override
    public void excute(CardLayout layout , JPanel cards) {
        System.exit(0);
    }
}

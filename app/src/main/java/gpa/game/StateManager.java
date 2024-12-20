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
public class StateManager {
    public State state;
   
    
    
    
    public void startState(CardLayout layout, JPanel cards){
       this.state = new StartButton(layout , cards);
    }
    
    public void leaderboardState(CardLayout layout, JPanel cards){
        this.state=  new LeaderboardButton(layout , cards);
    }
    
    public void exitState(CardLayout layout, JPanel cards){
        this.state = new ExitButton(layout , cards );
    }
    
    public void submitState(CardLayout layout, JPanel cards ,String playerName , int score , GameOverScreen gameOverScreen){
        this.state = new SubmitButton(score , gameOverScreen , playerName ,layout , cards);
    }
    
    public void MainState(CardLayout layout, JPanel cards){
       this.state = new MainMenuState(layout , cards);
    }
    
    public State getState(){
        return this.state ;
    }
         
    public void setState (State state){
        
    }
}

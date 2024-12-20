/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

/**
 *
 * @author lenovo
 */

import java.awt.Graphics;
import javax.swing.ImageIcon;

public abstract class Grade {
    int x, y, width, height, speed;
    ImageIcon icon;
    
    Grade(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void moveGrade(){
        this.y += this.speed;
    }
    
    void draw(Graphics g) {
        g.drawImage(icon.getImage(), x, y, width, height, null);
    }
    abstract String getGradeChar();
}

class GradeA extends Grade {
    final ImageIcon image = new ImageIcon(getClass().getResource("/a.png")); 
    
    GradeA(int x, int y, int width, int height, int speed){
        super(x, y, width, height, speed);
        setIcon(image);
    }
    String getGradeChar(){
        return "A";
    }
}

class GradeB extends Grade {
    final ImageIcon image = new ImageIcon(getClass().getResource("/b.png"));   
    
    GradeB(int x, int y, int width, int height, int speed){
        super(x, y, width, height, speed);
        super.setIcon(image);
    }
    String getGradeChar(){
        return "B";        
    }
}

class GradeC extends Grade {
    final ImageIcon image = new ImageIcon(getClass().getResource("/c.png"));
    
    GradeC(int x, int y, int width, int height, int speed){
        super(x, y, width, height, speed);
        super.setIcon(image);
    }
    
    String getGradeChar(){
        return "C";        
    }
}

class GradeD extends Grade {
    final ImageIcon image = new ImageIcon(getClass().getResource("/d.png"));
    
    GradeD(int x, int y, int width, int height, int speed){
        super(x, y, width, height, speed);
        super.setIcon(image);
    }
    String getGradeChar(){
        return "D";        
    }
}

class GradeF extends Grade {
    final ImageIcon image = new ImageIcon(getClass().getResource("/f.png"));

    GradeF(int x, int y, int width, int height, int speed){
        super(x, y, width, height, speed);
        super.setIcon(image);
    }
    String getGradeChar(){
        return "F";        
    }   
}

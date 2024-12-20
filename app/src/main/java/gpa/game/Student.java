/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

/**
 *
 * @author ahmed
 */
import java.awt.Graphics;
import javax.swing.ImageIcon;

class Student {
    int x, y, width, height;
    private ImageIcon image;
    private static final String HAPPY_PATH = "/happy_student128.png";
    private static final String SAD_PATH = "/sad_student128.png";

    public Student(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = new ImageIcon(getClass().getResource(HAPPY_PATH));
    }
    
    public void changeImage(String imageText){
        switch(imageText){
            case "happy":
                this.image = new ImageIcon(getClass().getResource(HAPPY_PATH));
                break;
            case "sad":
                this.image = new ImageIcon(getClass().getResource(SAD_PATH));
                break;
        }
    }
    public void draw(Graphics g) {
        g.drawImage(image.getImage(), x, y, width, height, null);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

import java.util.Random;

/**
 *
 * @author lenovo    public static GradeFactory collectGrade(){

 */
public class GradeFactory {
    private final static String[] gradeChar = {"A", "B", "C", "D", "F"};
    
    public static Grade getGrade(String gradeText, int x, int y, int width, int height, int speed){
        switch (gradeText) {
            case "A":
                return new GradeA(x, y, width, height, speed);
            case "B":
                return new GradeB(x, y, width, height, speed);
            case "C":
                return new GradeC(x, y, width, height, speed);
            case "D":
                return new GradeD(x, y, width, height, speed);
            case "F":
                return new GradeF(x, y, width, height, speed);
            default:
                throw new IllegalArgumentException("Unknown Grade " +  gradeText);
        }
    }
    
    public static Grade getRandomGrade(){
        
        int gradeIndex = new Random().nextInt(5);
        int gradeSpeed = new Random().nextInt(2,16);
        int gradeX = new Random().nextInt(750);
        
        return getGrade(gradeChar[gradeIndex], gradeX, 0, 48, 48, gradeSpeed);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa.game;

/**
 *
 * @author ahmed
 */
public class MoveRightCommand implements MovementCommand {

    @Override
    public void execute(Student student) {
        if (student.x < 672) {
            student.x += 15;
        }
    }

}

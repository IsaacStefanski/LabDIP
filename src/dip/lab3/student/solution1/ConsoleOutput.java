/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Isaac
 */
public class ConsoleOutput implements Output{
    @Override
    public void outputMessage(String text) {
        System.out.println("Message:");
        System.out.println(text);
    }
}
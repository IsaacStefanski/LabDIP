/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class KeyboardInput implements Input{
    @Override
    public String receiveMessage() {
        System.out.println("Type message, then press enter:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
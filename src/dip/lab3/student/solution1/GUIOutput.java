/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class GUIOutput implements Output{
    @Override
    public void outputMessage(String line) {
        JOptionPane.showConfirmDialog(null, line);
    }
}
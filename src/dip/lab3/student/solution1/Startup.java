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
public class Startup {
    public static void main(String[] args) {
        Input keyboardInput = new KeyboardInput();
	Input fileInput = new FileInput();
        Output consoleOut = new ConsoleOutput();
        Output guiOut = new GUIOutput();
		
	MessageService msgService1 = new MessageService(keyboardInput, consoleOut);
	msgService1.beginMessaging();
        
        System.out.println("");
        
        MessageService msgService2 = new MessageService(fileInput, guiOut);
	msgService2.beginMessaging();
    }
}
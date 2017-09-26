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
public class MessageService {
    private Input input;
    private Output output;
    
    public MessageService(Input input, Output output){
        this.input = input;
        this.output = output;
    }
    
    public void beginMessaging() {
        String msg = input.receiveMessage();
        output.outputMessage(msg);
    }
}
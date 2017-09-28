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
    private MessageInput messageInput;
    private MessageOutput messageOutput;
    
    public MessageService(MessageInput input, MessageOutput output){
        setMessageInput(input);
        setMessageOutput(output);
    }
    
    public final void beginMessaging() {
        String msg = messageInput.receiveMessage();
        messageOutput.outputMessage(msg);
    }

    public MessageInput getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(MessageInput messageInput) {
        if(messageInput != null){
            this.messageInput = messageInput;
        } else {
            throw new IllegalArgumentException("Message Input cannot be null");
        }
    }

    public MessageOutput getMessageOutput() {
        return messageOutput;
    }

    public void setMessageOutput(MessageOutput messageOutput) {
        if(messageOutput != null){
            this.messageOutput = messageOutput;
        } else {
            throw new IllegalArgumentException("Message Output cannot be null");
        }
    }
}
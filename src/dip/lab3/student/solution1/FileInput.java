/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Isaac
 */
public class FileInput implements Input{
    private boolean lineReadFlag = false;
    
    @Override
    public String receiveMessage() {
        File data = new File(File.separator + "messages.txt");

	BufferedReader in = null;
	String line = null;
			  
	try {
            if (data.exists()){
		in = new BufferedReader(new java.io.FileReader(data));
		line = in.readLine();
		in.close();
            } else {
		System.out.println("File not found - messages.txt");
		line = null;
            }
	} catch (IOException ioe) {
            try {
		if( in != null ) in.close();
            } catch(IOException ioe2) {
		System.out.println( ioe2.getMessage() );
            }
	System.out.println(ioe.getMessage());
	System.exit(1);
        }
			  
	if(lineReadFlag) {
            return null;
	} else {
            lineReadFlag = true;
            return line;
	}
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.io.FileReader;
import java.io.Reader;
import javax.swing.JOptionPane;

/**
 *
 * @author Angela Ortega Gabarro
 */
public class EditarFicheros {
    
    private String EditorXML = "C:\\Windows\\system32\\notepad.exe";
    private String EditorTXT = "C:\\Windows\\system32\\notepad.exe";
    
        /**
	 * Funcion que lanza el editor de un fichero XML en el disco
	 * @param fichero
	 */
	public void EditarFicheroXML (String fichero) {
		try { 
			Process p = Runtime.getRuntime().exec(EditorXML + " " + fichero);
			
					//new File(fichero).getAbsolutePath() + "'");	
		} catch (Exception ex) {
			System.err.println("Error" + ex + "Error");
		}		
	}
	
	/**
	 * Funcion que lanza el editor de un fichero TXT en el disco
	 * @param fichero
	 */
	public void EditarFicheroTXT (String fichero) {
		try {
			Process p = Runtime.getRuntime().exec(EditorTXT + " " + fichero);
				//new File(fichero).getAbsolutePath() + "'");	
		} catch (Exception ex) {
			System.err.println("Error" + ex + "Error");
		}		
	}
}

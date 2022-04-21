package Funciones;

import java.io.*;

public class Ficheros {

	/**
	 * Funcion que borra un directorio con todo su contenido.
	 *  
	 * @param ruta String con la ruta del directorio a eliminar
	 */
	public static void deltree (String ruta) {
	
		File [] dir = new java.io.File(ruta).listFiles();
			
		for (int i=0; i<dir.length; i++) 
			dir[i].delete();
		
		File raiz = new File(ruta);
		raiz.delete();
	}
	
	/** The size of blocking to use */
	protected static final int BLKSIZ = 16384;	
	
	/** Read the entire content of a Reader into a String */
	public static String readerToString(Reader is) throws IOException {
		StringBuffer sb = new StringBuffer();
		char[] b = new char[BLKSIZ];
		int n;

		// Read a block. If it gets any chars, append them.
		while ((n = is.read(b)) > 0) {
			sb.append(b, 0, n);
		}

		// Only construct the String object once, here.
		return sb.toString();
	}	
	
	/** Write a String as the entire content of a File */
	public static void stringToFile(String text, String fileName)
	throws IOException {
		BufferedWriter os = new BufferedWriter(new FileWriter(fileName));
		os.write(text);
		os.flush();
		os.close();
	}

}

package Funciones;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Clase encargada de cargar los mazos a partir de ficheros XML
 * @author Angela Ortega Gabarro
 */
public class CargaXML {
	/** Variables para manejar por el parser **/
	private int gana = 0;
	private int pierde = 0;

	/**
	 * Fucion que carga un mazo de cartas en memoria a partir de un documento XML
	 * @param mazo
	 * @param fichero
	 * @param mensajes 
	 */
	public CargaXML (List mazo, String fichero, boolean mensajes){
		mazo.clear();
		try {
			if (mensajes)
				System.err.println("Leyendo " + fichero + " ...");
			String uri = "file:"+new File(fichero).getAbsolutePath();
			if (mensajes)
				System.err.println("uri: <<" + uri + ">>");
			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = fact.newDocumentBuilder();
			Document doc = parser.parse(uri);
			if (mensajes)
				System.err.println("Recorriendo " + fichero + " ...");
			recorreMazo(mazo, doc);
		} catch (SAXParseException ex) {
			System.err.println("+===============================================================");
			System.err.println("|                       Error de Parse SAX                      ");
			System.err.println("+===============================================================");
			System.err.println(fichero);
			System.err.println(ex.toString());
			System.err.println("En la linea " + ex.getLineNumber());
			System.err.println("+===============================================================");
		} catch (SAXException ex) {
			System.err.println("+===============================================================");
			System.err.println("|                           Error de SAX                        ");
			System.err.println("+===============================================================");
			System.err.println(fichero);
			System.err.println(ex.toString());
			System.err.println("+==============================================================="); 
		} catch (Exception ex) {
			System.err.println("+===============================================================");
			System.err.println("|                   Error al cargar archivo XML                 ");
			System.err.println("+===============================================================");
			System.err.println(fichero);
			System.err.println(ex.getClass());
			System.err.println(ex.getMessage());
			System.err.println("+===============================================================");
		}
		if (mensajes)
			System.err.println("Terminado recorrido de " + fichero + " ...");
	}
	
	/**
	 * Fucion que recorre recursivamente el arbol de un documento XML
	 * @param mazo
	 * @param p 
	 */
	protected void recorreMazo (List mazo, Node p) {
		int importe = 0;
		
		if (p == null) {
			return;
		}
		NodeList nodes = p.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
			if (n == null) {
				continue;
			}
			importe = revisaNodo (mazo, n);
			if (importe != -1) {
				if (n.getParentNode().getNodeName() == "Gana")
					this.gana = importe;
				else if (n.getParentNode().getNodeName() == "Pierde")
					this.pierde = importe;
			}
		}
		if (p.getNodeName() == "Carta")
			mazo.add(new Carta (this.gana, this.pierde));
	}
	
	/**
	 * Funcion que recorre recorre las ramas de un nodo.
	 * @param mazo
	 * @param n
	 * @return
	 */
	protected int revisaNodo (List mazo, Node n) {

		switch (n.getNodeType()) {
		case Node.ELEMENT_NODE:
			recorreMazo (mazo, n);
			return -1;
		case Node.TEXT_NODE:
			String text = n.getNodeValue().trim();
			if (text.length() == 0 || text.equals("\n") || text.equals("\t") || text.equals("\\r")) {
				return -1;
			}
			return Integer.parseInt(text);
		default:
			System.err.println("OTHER NODE " + n.getNodeType() + ": " + n.getClass());
			return -1;
		}
	}
}

package Funciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.io.*;
import java.lang.Thread;
import javax.swing.JButton;

/**
 * Interface de usuario del programa Cartas. 
 *  Este programa permite realizar experimentos psicologicos propuestos por Gambling.
 * @author Angela Ortega Gabarro
 * @version 1.0b
 */
public class IU extends JFrame {

	private String EditorXML = "C:\\Windows\\system32\\notepad.exe";
	private String EditorTXT = "C:\\Windows\\system32\\notepad.exe";
	
	private Juego juego = null;
	private int estado = 0;
	
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu archivoMenu = null;
	private JMenu ayudaMenu = null;
	private JMenuItem salirMenuItem = null;
	private JMenuItem acercadeMenuItem = null;
	private JPanel jPRes = null;
	private JLabel jLGanancias = null;
	private JTextField jTFGanancias = null;
	private JPanel jPMazos = null;
	private JPanel jPRotulos = null;
	private JPanel jPAnversoA = null;
	private JPanel jPAnversoB = null;
	private JPanel jPAnversoC = null;
	private JPanel jPAnversoD = null;
	private JLabel jLAnversoB = null;
	private JLabel jLAnversoC = null;
	private JLabel jLAnversoD = null;
	private JMenuItem modificardMenuItem = null;
	private JMenu modificarMenu = null;
	private JLabel jLMazoA = null;
	private JLabel jLMazoB = null;
	private JLabel jLMazoC = null;
	private JLabel jLMazoD = null;
	private JMenuItem modificaraMenuItem = null;
	private JMenuItem modificarbMenuItem = null;
	private JMenuItem modificarcMenuItem = null;
	private JMenuItem recargarMenuItem = null;
	private JMenu experimentoMenu = null;
	private JMenuItem ejecutarMenuItem = null;
	private JPanel jPMazoA0 = null;
	private JPanel jPReversoA = null;
	private JLabel jLReversoA = null;
	private JPanel jPMazoB0 = null;
	private JPanel jPReversoB = null;
	private JLabel jLReversoB = null;
	private JPanel jPMazoC0 = null;
	private JPanel jPReversoC = null;
	private JPanel jPMazoD0 = null;
	private JPanel jPReversoD = null;
	private JLabel jLReversoC = null;
	private JLabel jLReversoD = null;
	private JLabel jLAnversoA = null;
	private JMenuItem detenerMenuItem = null;
	private JMenuItem instruccionesMenuItem = null;
	private JMenuItem modInstruccionesMenuItem = null;
	private JLabel jLEstado = null;
	private JMenuItem ayudaMenuItem = null;
	/**
	 * This method initializes jPResultados	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPRes() {
		if (jPRes == null) {
			jLEstado = new JLabel();
			jLEstado.setText("*");
			jLEstado.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 80));
			jLGanancias = new JLabel();
			jLGanancias.setText("Marcador:");
			jLGanancias.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 44));
			jPRes = new JPanel();
			jPRes.setLayout(new FlowLayout());
			jPRes.add(jLEstado, null);
			jPRes.add(jLGanancias, null);
			jPRes.add(getJTFGanancias(), null);
		}
		return jPRes;
	}

	/**
	 * This method initializes jTFGanancias	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTFGanancias() {
		if (jTFGanancias == null) {
			jTFGanancias = new JTextField();
			jTFGanancias.setEditable(false);
			jTFGanancias.setText("2.000 €");
			jTFGanancias.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 44));
		}
		return jTFGanancias;
	}

	/**
	 * This method initializes jPMazos	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPMazos() {
		if (jPMazos == null) {
			jPMazos = new JPanel();
			jPMazos.setLayout(new GridLayout(1,4));
			jPMazos.add(getJPMazoA0(), null);
			jPMazos.add(getJPMazoB0(), null);
			jPMazos.add(getJPMazoC0(), null);
			jPMazos.add(getJPMazoD0(), null);
		}
		return jPMazos;
	}

	/**
	 * This method initializes jPRotulos	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPRotulos() {
		if (jPRotulos == null) {
			jLMazoA = new JLabel();
			jLMazoA.setText("Mazo A");
			jLMazoA.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLMazoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLMazoD = new JLabel();
			jLMazoD.setText("Mazo D");
			jLMazoD.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLMazoD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLMazoC = new JLabel();
			jLMazoC.setText("Mazo C");
			jLMazoC.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLMazoC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLMazoB = new JLabel();
			jLMazoB.setText("Mazo B");
			jLMazoB.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLMazoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jPRotulos = new JPanel();
			jPRotulos.setLayout(new GridLayout(1,4));
			jPRotulos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
			jPRotulos.add(jLMazoA, null);
			jPRotulos.add(jLMazoB, null);
			jPRotulos.add(jLMazoC, null);
			jPRotulos.add(jLMazoD, null);
		}
		return jPRotulos;
	}

	/**
	 * This method initializes jPMazoA	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPAnversoA() {
		if (jPAnversoA == null) {
			jLAnversoA = new JLabel();
			jLAnversoA.setText("");
			jLAnversoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLAnversoA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			jLAnversoA.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLAnversoA.setIcon(new ImageIcon("anverso2.jpg"));
			jPAnversoA = new JPanel();
			jPAnversoA.setName("jPAnversoA");
			jPAnversoA.setLayout(new FlowLayout());
			jPAnversoA.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
			jPAnversoA.add(jLAnversoA, null);
		}
		return jPAnversoA;
	}

	/**
	 * This method initializes jPMazoB	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPAnversoB() {
		if (jPAnversoB == null) {
			jLAnversoB = new JLabel();
			jLAnversoB.setText("");
			jLAnversoB.setIcon(new ImageIcon("anverso2.jpg"));
			jLAnversoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			jLAnversoB.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLAnversoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jPAnversoB = new JPanel();
			jPAnversoB.setName("jPMazoB");
			jPAnversoB.setLayout(new FlowLayout());
			jPAnversoB.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
			jPAnversoB.add(jLAnversoB, null);
		}
		return jPAnversoB;
	}

	/**
	 * This method initializes jPMazoC	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPAnversoC() {
		if (jPAnversoC == null) {
			jLAnversoC = new JLabel();
			jLAnversoC.setText("");
			jLAnversoC.setIcon(new ImageIcon("anverso2.jpg"));
			jLAnversoC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			jLAnversoC.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLAnversoC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jPAnversoC = new JPanel();
			jPAnversoC.setName("jPAnversoC");
			jPAnversoC.setLayout(new FlowLayout());
			jPAnversoC.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
			jPAnversoC.add(jLAnversoC, null);
		}
		return jPAnversoC;
	}

	/**
	 * This method initializes jPMazoD	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPAnversoD() {
		if (jPAnversoD == null) {
			jLAnversoD = new JLabel();
			jLAnversoD.setText("");
			jLAnversoD.setIcon(new ImageIcon("anverso2.jpg"));
			jLAnversoD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			jLAnversoD.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 22));
			jLAnversoD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jPAnversoD = new JPanel();
			jPAnversoD.setName("jPAnversoD");
			jPAnversoD.setLayout(new FlowLayout());
			jPAnversoD.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
			jPAnversoD.add(jLAnversoD, null);			
		}
		return jPAnversoD;
	}

	/**
	 * This method initializes jMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getModificardMenuItem() {
		if (modificardMenuItem == null) {
			modificardMenuItem = new JMenuItem();
			modificardMenuItem.setText("Mazo D");
			modificardMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EditarFicheroXML ("datos/BarajaD.xml");
				}
			});
		}
		return modificardMenuItem;
	}

	/**
	 * This method initializes modificarMenu	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getModificarMenu() {
		if (modificarMenu == null) {
			modificarMenu = new JMenu();
			modificarMenu.setText("Editar Mazos");
			modificarMenu.add(getModificaraMenuItem());
			modificarMenu.add(getModificarbMenuItem());
			modificarMenu.add(getModificarcMenuItem());
			modificarMenu.add(getModificardMenuItem());
		}
		return modificarMenu;
	}

	/**
	 * This method initializes jMenuItem1	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getModificaraMenuItem() {
		if (modificaraMenuItem == null) {
			modificaraMenuItem = new JMenuItem();
			modificaraMenuItem.setText("Mazo A");
			modificaraMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EditarFicheroXML ("datos/BarajaA.xml");
				}
			});
		}
		return modificaraMenuItem;
	}

	/**
	 * This method initializes jMenuItem2	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getModificarbMenuItem() {
		if (modificarbMenuItem == null) {
			modificarbMenuItem = new JMenuItem();
			modificarbMenuItem.setText("Mazo B");
			modificarbMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EditarFicheroXML ("datos/BarajaB.xml");
				}
			});
		}
		return modificarbMenuItem;
	}

	/**
	 * This method initializes jMenuItem3	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getModificarcMenuItem() {
		if (modificarcMenuItem == null) {
			modificarcMenuItem = new JMenuItem();
			modificarcMenuItem.setText("Mazo C");
			modificarcMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EditarFicheroXML ("datos/BarajaC.xml");
				}
			});
		}
		return modificarcMenuItem;
	}

	/**
	 * This method initializes recargarMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getRecargarMenuItem() {
		if (recargarMenuItem == null) {
			recargarMenuItem = new JMenuItem();
			recargarMenuItem.setText("Recargar Mazos");
			recargarMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					juego.cargarMazos();
				}
			});
		}
		return recargarMenuItem;
	}

	/**
	 * This method initializes experimentoMenu	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getExperimentoMenu() {
		if (experimentoMenu == null) {
			experimentoMenu = new JMenu();
			experimentoMenu.setText("Experimento");
			experimentoMenu.add(getEjecutarMenuItem());
			experimentoMenu.add(getDetenerMenuItem());
		}
		return experimentoMenu;
	}

	/**
	 * This method initializes ejecutarMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getEjecutarMenuItem() {
		if (ejecutarMenuItem == null) {
			ejecutarMenuItem = new JMenuItem();
			ejecutarMenuItem.setText("Ejecutar");
			ejecutarMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					CambiaEstado (2);
				}
			});
		}
		return ejecutarMenuItem;
	}

	/**
	 * This method initializes jPMazoA0	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPMazoA0() {
		if (jPMazoA0 == null) {
			jPMazoA0 = new JPanel();
			jPMazoA0.setLayout(new CardLayout());
			jPMazoA0.add(getJPReversoA(), getJPReversoA().getName());
			jPMazoA0.add(getJPAnversoA(), getJPAnversoA().getName());
			jPMazoA0.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JugarMazo ('A');					
				}
			});
		}
		return jPMazoA0;
	}

	/**
	 * This method initializes jPReversoA	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPReversoA() {
		if (jPReversoA == null) {
			jLReversoA = new JLabel();
			jLReversoA.setText("");
			jLReversoA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			jLReversoA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			jLReversoA.setIcon(new ImageIcon("reverso2.jpg"));
			jPReversoA = new JPanel();
			jPReversoA.setName("jPReversoA");
			jPReversoA.setPreferredSize(new java.awt.Dimension(95,143));
			jPReversoA.add(jLReversoA, null);
		}
		return jPReversoA;
	}

	/**
	 * This method initializes jPMazoB0	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPMazoB0() {
		if (jPMazoB0 == null) {
			jPMazoB0 = new JPanel();
			jPMazoB0.setLayout(new CardLayout());
			jPMazoB0.add(getJPReversoB(), getJPReversoB().getName());
			jPMazoB0.add(getJPAnversoB(), getJPAnversoB().getName());
			jPMazoB0.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JugarMazo ('B');
				}
			});
		}
		return jPMazoB0;
	}

	/**
	 * This method initializes jPReversoB	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPReversoB() {
		if (jPReversoB == null) {
			jLReversoB = new JLabel();
			jLReversoB.setText("");
			jLReversoB.setIcon(new ImageIcon("reverso2.jpg"));
			jPReversoB = new JPanel();
			jPReversoB.setName("jPReversoB");
			jPReversoB.add(jLReversoB, null);
		}
		return jPReversoB;
	}

	/**
	 * This method initializes jPMazoC0	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPMazoC0() {
		if (jPMazoC0 == null) {
			jPMazoC0 = new JPanel();
			jPMazoC0.setLayout(new CardLayout());
			jPMazoC0.add(getJPReversoC(), getJPReversoC().getName());
			jPMazoC0.add(getJPAnversoC(), getJPAnversoC().getName());
			jPMazoC0.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JugarMazo ('C');
				}
			});
		}
		return jPMazoC0;
	}

	/**
	 * This method initializes jPReversoC		
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPReversoC() {
		if (jPReversoC == null) {
			jLReversoC = new JLabel();
			jLReversoC.setText("");
			jLReversoC.setIcon(new ImageIcon("reverso2.jpg"));
			jPReversoC = new JPanel();
			jPReversoC.setName("jPReversoC");
			jPReversoC.add(jLReversoC, null);
		}
		return jPReversoC;
	}

	/**
	 * This method initializes jPMazoD0	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPMazoD0() {
		if (jPMazoD0 == null) {
			jPMazoD0 = new JPanel();
			jPMazoD0.setLayout(new CardLayout());
			jPMazoD0.add(getJPReversoD(), getJPReversoD().getName());
			jPMazoD0.add(getJPAnversoD(), getJPAnversoD().getName());
			jPMazoD0.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JugarMazo ('D');
				}
			});
		}
		return jPMazoD0;
	}

	/**
	 * This method initializes jPReversoD	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPReversoD() {
		if (jPReversoD == null) {
			jLReversoD = new JLabel();
			jLReversoD.setText("");
			jLReversoD.setIcon(new ImageIcon("reverso2.jpg"));
			jPReversoD = new JPanel();
			jPReversoD.setName("jPReversoD");
			jPReversoD.add(jLReversoD, null);
		}
		return jPReversoD;
	}

	/**
	 * This method initializes jMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getDetenerMenuItem() {
		if (detenerMenuItem == null) {
			detenerMenuItem = new JMenuItem();
			detenerMenuItem.setText("Detener");
			detenerMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					CambiaEstado (0);
					juego.grabaResultado();
				}
			});
		}
		return detenerMenuItem;
	}

	/**
	 * This method initializes instruccionesMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getInstruccionesMenuItem() {
		if (instruccionesMenuItem == null) {
			instruccionesMenuItem = new JMenuItem();
			instruccionesMenuItem.setText("Instrucciones");
			instruccionesMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					MostrarInstrucciones ();
				}
			});
		}
		return instruccionesMenuItem;
	}

	/**
	 * This method initializes modInstruccionesMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getModInstruccionesMenuItem() {
		if (modInstruccionesMenuItem == null) {
			modInstruccionesMenuItem = new JMenuItem();
			modInstruccionesMenuItem.setText("Editar Instrucciones");
			modInstruccionesMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EditarFicheroTXT ("Instrucciones.txt");
				}
			});
		}
		return modInstruccionesMenuItem;
	}

	/**
	 * This method initializes ayudaMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getAyudaMenuItem() {
		if (ayudaMenuItem == null) {
			ayudaMenuItem = new JMenuItem();
			ayudaMenuItem.setActionCommand("Ayuda");
			ayudaMenuItem.setText("Ayuda");
			ayudaMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					MostrarAyuda();
				}
			});
		}
		return ayudaMenuItem;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		IU application = new IU();
		application.show();
	}

	/**
	 * This is the default constructor
	 */
	public IU() {
		super();
		initialize();
		//CENTRA EL DIALOGO EN LA PANTALLA
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();

		this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
	}

	/**
	 * This method initializes this
	 * @return void
	 */
	private void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJJMenuBar());
		this.setSize(796, 556);
		this.setContentPane(getJContentPane());
		this.setTitle("Gambling");
		//this.setSize(this.getMaximumSize());
		//this.setResizable(false);
		
				
		// Crear el objeto e inicializarlo.
		juego = new Juego ();
		juego.cargarMazos();
		
		jTFGanancias.setText(String.valueOf(juego.getSaldo()) + " €");
		jTFGanancias.repaint();
		CambiaEstado (0);

	}

	/**
	 * This method initializes jContentPane
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPRotulos(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getJPMazos(), java.awt.BorderLayout.CENTER);
			jContentPane.add(getJPRes(), java.awt.BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getArchivoMenu());
			jJMenuBar.add(getExperimentoMenu());
			jJMenuBar.add(getAyudaMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getArchivoMenu() {
		if (archivoMenu == null) {
			archivoMenu = new JMenu();
			archivoMenu.setText("Archivo");
			archivoMenu.add(getModificarMenu());
			archivoMenu.add(getModInstruccionesMenuItem());
			archivoMenu.add(getRecargarMenuItem());			
			archivoMenu.add(getSalirMenuItem());
		}
		return archivoMenu;
	}

	/**
	 * This method initializes jMenu	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getAyudaMenu() {
		if (ayudaMenu == null) {
			ayudaMenu = new JMenu();
			ayudaMenu.setText("Ayuda");
			ayudaMenu.add(getAcercadeMenuItem());
			ayudaMenu.add(getAyudaMenuItem());
			ayudaMenu.add(getInstruccionesMenuItem());
		}
		return ayudaMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getSalirMenuItem() {
		if (salirMenuItem == null) {
			salirMenuItem = new JMenuItem();
			salirMenuItem.setText("Salir");
			salirMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return salirMenuItem;
	}

	/**
	 * This method initializes jMenuItem	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getAcercadeMenuItem() {
		if (acercadeMenuItem == null) {
			acercadeMenuItem = new JMenuItem();
			acercadeMenuItem.setText("Acerca de ...");
			acercadeMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
		}
		return acercadeMenuItem;
	}
	
	/**
	 * Muestra las instrucciones leyendolas de un archivo del disco
	 * @return void
	 */
	private void MostrarInstrucciones () {
		
		String cadena = "";
		
		try {
			Reader is = new FileReader ("Instrucciones.txt");
			cadena = FileIO.readerToString(is);			
		} catch(Exception ex) {
			System.err.println("+===============================================================");
			System.err.println("|                   Error al cargar archivo de instrucciones.                 ");
			System.err.println("+===============================================================");
			System.err.println(ex.getClass());
			System.err.println(ex.getMessage());
			System.err.println("+===============================================================");
		};
		JOptionPane.showMessageDialog (IU.this, cadena, "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Muestra las instrucciones leyendolas de un archivo del disco
	 * @return void
	 */
	private void MostrarAyuda () {
		
		String cadena = "";
		
		try {
			Reader is = new FileReader ("Ayuda.txt");
			cadena = FileIO.readerToString(is);			
		} catch(Exception ex) {
			System.err.println("+===============================================================");
			System.err.println("|                   Error al cargar archivo de Ayuda.                 ");
			System.err.println("+===============================================================");
			System.err.println(ex.getClass());
			System.err.println(ex.getMessage());
			System.err.println("+===============================================================");
		};
		JOptionPane.showMessageDialog (IU.this, cadena, "Ayuda", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Funcion que levanta la carta superior de uno de los mazos
	 * @param mazo
	 */
	private void JugarMazo (char mazo) {

		// Si el estado no es activo, no juega el mazo.
		if (estado != 2) return;
		CambiaEstado (1);
		
		// Inicializar los controles visuales
		CardLayout la = (CardLayout)(jPMazoA0.getLayout());
		CardLayout lb = (CardLayout)(jPMazoB0.getLayout());
		CardLayout lc = (CardLayout)(jPMazoC0.getLayout());
		CardLayout ld = (CardLayout)(jPMazoD0.getLayout());
		
		la.show(jPMazoA0, getJPReversoA().getName());
		lb.show(jPMazoB0, getJPReversoB().getName());
		lc.show(jPMazoC0, getJPReversoC().getName());
		ld.show(jPMazoD0, getJPReversoD().getName());

		jLAnversoA.setText("");
		jLAnversoB.setText("");
		jLAnversoC.setText("");
		jLAnversoD.setText("");
			
		if (juego.jugarMazo(mazo) == 0) {
			// Mostrar resultado de la carta
			switch (mazo) {
			case 'A': case 'a':
				jLAnversoA.setText("<html><body>Gana:<br>" + String.valueOf(juego.getCarta(mazo).getGanancia()) + "€" + "<br><br>Pierde:<br>" + String.valueOf(juego.getCarta(mazo).getPerdida()) + "€</body></html>");
				la.show(jPMazoA0, getJPAnversoA().getName());

				break;
			case 'B': case 'b':
				jLAnversoB.setText("<html><body>Gana:<br>" + String.valueOf(juego.getCarta(mazo).getGanancia()) + "€" + "<br><br>Pierde:<br>" + String.valueOf(juego.getCarta(mazo).getPerdida()) + "€</body></html>");
				lb.show(jPMazoB0, getJPAnversoB().getName());
				break;
			case 'C': case 'c':
				jLAnversoC.setText("<html><body>Gana:<br>" + String.valueOf(juego.getCarta(mazo).getGanancia()) + "€" + "<br><br>Pierde:<br>" + String.valueOf(juego.getCarta(mazo).getPerdida()) + "€</body></html>");
				lc.show(jPMazoC0, getJPAnversoC().getName());
				break;
			case 'D': case 'd':
				jLAnversoD.setText("<html><body>Gana:<br>" + String.valueOf(juego.getCarta(mazo).getGanancia()) + "€" + "<br><br>Pierde:<br>" + String.valueOf(juego.getCarta(mazo).getPerdida()) + "€</body></html>");
				ld.show(jPMazoD0, getJPAnversoD().getName());
				break;
			} 
			// Actualizar ganancias
			jTFGanancias.setText(String.valueOf(juego.getSaldo()) + " €");
			jTFGanancias.repaint();
		} 
		else switch (mazo) {
		case 'A': case 'a':
			jPMazoA0.setVisible(false);
			break;
		case 'B': case 'b':
			jPMazoB0.setVisible(false);
			break;
		case 'C': case 'c':
			jPMazoC0.setVisible(false);
			break;
		case 'D': case 'd':
			jPMazoD0.setVisible(false);
			break;
		}
		repaint();
		new HabilitarMazo ('A').start();
	}
	
	/**
	 * Funcion que lanza el editor de un fichero XML en el disco
	 * @param fichero
	 */
	private void EditarFicheroXML (String fichero) {
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
	private void EditarFicheroTXT (String fichero) {
		try {
			Process p = Runtime.getRuntime().exec(EditorTXT + " " + fichero);
				//new File(fichero).getAbsolutePath() + "'");	
		} catch (Exception ex) {
			System.err.println("Error" + ex + "Error");
		}		
	}
	
	private void CambiaEstado (int estado) {
	
		switch (estado) { 
			case 0:
				jLEstado.setForeground(Color.RED);
				jLAnversoA.setText("");
				jLAnversoB.setText("");
				jLAnversoC.setText("");
				jLAnversoD.setText("");
				jTFGanancias.setText(String.valueOf(juego.getSaldo()) + " €");
				jTFGanancias.repaint();
				this.estado = 0;
				break;
			case 1:
				jLEstado.setForeground(Color.YELLOW);
				this.estado = 1;
				break;
			case 2:
				if (this.estado == 0){
					
					String cLimite = "100";
					
					cLimite = JOptionPane.showInputDialog("Indicar el limite de jugadas:",cLimite);
					if (cLimite == null) cLimite = "100";
					MostrarInstrucciones ();					
					
					jLAnversoA.setText("");
					jLAnversoB.setText("");
					jLAnversoC.setText("");
					jLAnversoD.setText("");
					
					juego.iniciarJuego(new Integer(cLimite), 2000);
					System.out.println(String.valueOf(juego.getSaldo()) + " €");
					jTFGanancias.setText(String.valueOf(juego.getSaldo()) + " €");
					jTFGanancias.repaint();
				}
				jLEstado.setForeground(Color.GREEN);
				this.estado = 2;
				break;
		}
	}
	
	/**
	 * Clase utilizada para lanzar el hilo que temporiza la recolocacion de los mazos 
	 */
	class HabilitarMazo extends Thread {
		char mazo;
		IU marco;
		
		/**
		 * Constructor de la clase
		 * @param m
		 */
		public HabilitarMazo (char m){
			mazo = m;
		}
		
		/**
		 * Metodo que ejecuta el hilo
		 * @return void
		 */
		public void run () {
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException x) {};
			CardLayout la = (CardLayout)(jPMazoA0.getLayout());
			CardLayout lb = (CardLayout)(jPMazoB0.getLayout());
			CardLayout lc = (CardLayout)(jPMazoC0.getLayout());
			CardLayout ld = (CardLayout)(jPMazoD0.getLayout());
			la.show(jPMazoA0, getJPReversoA().getName());
			la.show(jPMazoA0, getJPReversoA().getName());
			lb.show(jPMazoB0, getJPReversoB().getName());
			lc.show(jPMazoC0, getJPReversoC().getName());
			ld.show(jPMazoD0, getJPReversoD().getName());
			jLAnversoA.setText("");
			jLAnversoB.setText("");
			jLAnversoC.setText("");
			jLAnversoD.setText("");
			CambiaEstado (2);
		}
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"

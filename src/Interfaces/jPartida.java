/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Funciones.Juego;
import Funciones.StructParametros;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.Timer;

/**
 *
 * @author Lyoko
 */
public class jPartida extends javax.swing.JInternalFrame {

    /**
     * Creates new form jPartida
     */
    private Juego juego;
    private int estado, gana, pierde, dinero, estadoJuego;

    StructParametros p;

    public jPartida(StructParametros p) {
        initComponents();
        //inicializamos crono
        this.p = p;
        t = new Timer(10, acciones);
        jcrono.setVisible(false);
        jTFGanancias.setVisible(false);
        // Crear el objeto e inicializarlo.
        estado = 0;
        estadoJuego = 0;
        juego = new Juego();
        juego.cargarMazos(p.getRuta(), p.getColocar(), p.isInvorden());

        jTFGanancias.setText("Bote: " + String.valueOf(juego.getSaldo()) + " €");

        Colocar();

        CambiaEstado(2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnMazoA = new javax.swing.JButton();
        jBtnMazoB = new javax.swing.JButton();
        jBtnMazoC = new javax.swing.JButton();
        jBtnMazoD = new javax.swing.JButton();
        jTFGanancias = new javax.swing.JLabel();
        jimg = new javax.swing.JLabel();
        jgana = new javax.swing.JLabel();
        jcrono = new javax.swing.JLabel();
        jAviso = new javax.swing.JLabel();

        setTitle("Partida en marcha");

        jBtnMazoA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMazoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        jBtnMazoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMazoAActionPerformed(evt);
            }
        });

        jBtnMazoB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMazoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        jBtnMazoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMazoBActionPerformed(evt);
            }
        });

        jBtnMazoC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMazoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        jBtnMazoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMazoCActionPerformed(evt);
            }
        });

        jBtnMazoD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMazoD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        jBtnMazoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMazoDActionPerformed(evt);
            }
        });

        jTFGanancias.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTFGanancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTFGanancias.setText("Marcador");

        jgana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jgana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jcrono.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcrono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jAviso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAviso.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnMazoA, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnMazoB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnMazoC, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnMazoD, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jimg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jgana, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcrono, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(jTFGanancias, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(jAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnMazoA, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMazoB, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jimg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnMazoC, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMazoD, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jgana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFGanancias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcrono, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAviso)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMazoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMazoAActionPerformed
        JugarMazo('A');
        jTFGanancias.setVisible(p.isVersaldo());
        jgana.setVisible(p.isSaldoganado());
        if (estadoJuego == 0) {
            jcrono.setVisible(p.isVeretardo());
            t.start();
        }
    }//GEN-LAST:event_jBtnMazoAActionPerformed

    private void jBtnMazoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMazoBActionPerformed
        JugarMazo('B');
        jTFGanancias.setVisible(p.isVersaldo());
        if (estadoJuego == 0) {
            jcrono.setVisible(p.isVeretardo());
            jgana.setVisible(p.isSaldoganado());
            t.start();
        }
    }//GEN-LAST:event_jBtnMazoBActionPerformed

    private void jBtnMazoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMazoCActionPerformed
        JugarMazo('C');
        jTFGanancias.setVisible(p.isVersaldo());
        if (estadoJuego == 0) {
            jcrono.setVisible(p.isVeretardo());
            jgana.setVisible(p.isSaldoganado());
            t.start();
        }
    }//GEN-LAST:event_jBtnMazoCActionPerformed

    private void jBtnMazoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMazoDActionPerformed
        JugarMazo('D');
        jTFGanancias.setVisible(p.isVersaldo());
        if (estadoJuego == 0) {
            jcrono.setVisible(p.isVeretardo());
            jgana.setVisible(p.isSaldoganado());
            t.start();
        }
    }//GEN-LAST:event_jBtnMazoDActionPerformed

    /**
     * Funcion que levanta la carta superior de uno de los mazos
     *
     * @param mazo
     */
    private void JugarMazo(char mazo) {

        // Si el estado no es activo, no juega el mazo.
        if (estado != 2) {
            return;
        }
        CambiaEstado(1);
        estadoJuego = juego.jugarMazo(mazo);
        if (estadoJuego == 0) {

            // Mostrar resultado de la carta
            switch (mazo) {
                case 'A':
                case 'a':
                    jBtnMazoA.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + "anverso2.png")));
                    gana = juego.getCarta(mazo).getGanancia();
                    pierde = juego.getCarta(mazo).getPerdida();
                    jBtnMazoA.setText("<html><body>Gana:<br>" + String.valueOf(gana) + "€" + "<br><br>Pierde:<br>" + String.valueOf(pierde) + "€</body></html>");
                    jBtnMazoA.setHorizontalTextPosition(CENTER);
                    break;
                case 'B':
                case 'b':
                    jBtnMazoB.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + "anverso2.png")));
                    gana = juego.getCarta(mazo).getGanancia();
                    pierde = juego.getCarta(mazo).getPerdida();
                    jBtnMazoB.setText("<html><body>Gana:<br>" + String.valueOf(gana) + "€" + "<br><br>Pierde:<br>" + String.valueOf(pierde) + "€</body></html>");
                    jBtnMazoB.setHorizontalTextPosition(CENTER);
                    break;
                case 'C':
                case 'c':
                    jBtnMazoC.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + "anverso2.png")));
                    gana = juego.getCarta(mazo).getGanancia();
                    pierde = juego.getCarta(mazo).getPerdida();
                    jBtnMazoC.setText("<html><body>Gana:<br>" + String.valueOf(gana) + "€" + "<br><br>Pierde:<br>" + String.valueOf(pierde) + "€</body></html>");
                    jBtnMazoC.setHorizontalTextPosition(CENTER);
                    break;
                case 'D':
                case 'd':
                    jBtnMazoD.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + "anverso2.png")));
                    gana = juego.getCarta(mazo).getGanancia();
                    pierde = juego.getCarta(mazo).getPerdida();
                    jBtnMazoD.setText("<html><body>Gana:<br>" + String.valueOf(gana) + "€" + "<br><br>Pierde:<br>" + String.valueOf(pierde) + "€</body></html>");
                    jBtnMazoD.setHorizontalTextPosition(CENTER);
                    break;
            }

            dinero = gana - pierde;

            if (dinero < 0) {
                jgana.setText("Has perdido " + dinero + " €");
                if (p.isSonido()) {
                    ReproducirSonido("./src/Sonido/pierde.wav");
                }
                if (dinero <= -250) {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(5))));
                } else if (dinero <= -200) {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(4))));
                } else if (dinero <= -150) {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(3))));
                } else if (dinero <= -100) {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(2))));
                } else if (dinero <= -50) {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(1))));
                } else {
                    jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getPierde(0))));
                }

            } else if (dinero == 0) {

            } else {
                jgana.setText("Has ganado " + dinero + " €");
                jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getGana())));
                if (p.isSonido()) {
                    ReproducirSonido("./src/Sonido/gana.wav");
                }
            }

            /* El estado simple de pierde-gana
             if (dinero < 0) {
             jgana.setText("Has perdido " + dinero + " €");
             jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes()+p.getPierde())));
             if (p.isSonido()) {
             ReproducirSonido("./src/Sonido/pierde.wav");
             }
             } else {
             jgana.setText("Has ganado " + dinero + " €");
             jimg.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes()+p.getGana())));
             if (p.isSonido()) {
             ReproducirSonido("./src/Sonido/gana.wav");
             }
             }
             */
            if (juego.getSaldo() < 0) {
                jAviso.setText("Tu saldo es negativo. Se te prestan " + p.getPrestamo() + "€");
                juego.setSaldo(juego.getSaldo() + p.getPrestamo());
                jAviso.setForeground(Color.red);
            }

            jTFGanancias.setText("Bote: " + String.valueOf(juego.getSaldo()) + " €");
        } else {
            if (estadoJuego == 3) {
                Frame f = JOptionPane.getFrameForComponent(this);
                jgameover dialog = new jgameover(f, true);
                dialog.show();
            }
        }
    }

    public void CambiaEstado(int estado) {

        switch (estado) {
            case 0:
                this.getContentPane().setBackground(Color.RED);
                jBtnMazoA.setText("");
                jBtnMazoB.setText("");
                jBtnMazoC.setText("");
                jBtnMazoD.setText("");
                jTFGanancias.setText("Bote: " + String.valueOf(juego.getSaldo()) + " €");
                this.estado = 0;
                break;
            case 1:
                this.getContentPane().setBackground(Color.YELLOW);
                this.estado = 1;

                break;
            case 2:
                if (this.estado == 0) {
                    // Actualizar ganancias
                    juego.iniciarJuego(p.getNumjugadas(), p.getSaldoini());
                    System.out.println(String.valueOf(juego.getSaldo()) + " €");
                    jTFGanancias.setText("Bote: " + String.valueOf(juego.getSaldo()) + " €");
                    jimg.setIcon(null);
                    jgana.setText("");
                    jAviso.setText("");
                }

                jBtnMazoA.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getImgCartas())));
                jBtnMazoB.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getImgCartas())));
                jBtnMazoC.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getImgCartas())));
                jBtnMazoD.setIcon(new javax.swing.ImageIcon(getClass().getResource(p.getRutaImagenes() + p.getImgCartas())));

                jBtnMazoA.setText("");
                jBtnMazoB.setText("");
                jBtnMazoC.setText("");
                jBtnMazoD.setText("");
                jAviso.setText("");

                this.getContentPane().setBackground(Color.GREEN);
                this.estado = 2;
                break;
        }
    }
    //Crono
    private Timer t;
    private int h, m, s, cs;
    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;
                ++h;
            }
            limiteTiempo();
            actualizarLabel();
        }

    };

    private void limiteTiempo() {
        if (s == p.getRetardo()) {
            t.stop();
            CambiaEstado(2);
            s = cs = 0;
            jcrono.setVisible(false);
        }
    }

    private void actualizarLabel() {
        //String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        int seg = p.getRetardo() - s - 1;
        int cseg = 100 - cs;
        String tiempo = (seg <= 9 ? "0" : "") + seg + ":" + (cseg <= 9 ? "0" : "") + cseg;
        jcrono.setText(tiempo);
    }

    public void ReproducirSonido(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    Juego getJuego() {
        return juego;
    }

    void Colocar() {
        int col = p.getColocar().length();
        JButton arr[] = {jBtnMazoA, jBtnMazoB, jBtnMazoC, jBtnMazoD};

        for (int i = 0; i < 4 - col; i++) {
            arr[3 - i].setVisible(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAviso;
    private javax.swing.JButton jBtnMazoA;
    private javax.swing.JButton jBtnMazoB;
    private javax.swing.JButton jBtnMazoC;
    private javax.swing.JButton jBtnMazoD;
    private javax.swing.JLabel jTFGanancias;
    private javax.swing.JLabel jcrono;
    private javax.swing.JLabel jgana;
    private javax.swing.JLabel jimg;
    // End of variables declaration//GEN-END:variables

}

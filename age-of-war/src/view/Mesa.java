/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controle;
import controller.Observador;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author rafae
 */
public class Mesa extends javax.swing.JFrame implements Observador {

    Controle controle;

    private Mesa() {

        iniciar();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    private static Mesa instance;

    public static Mesa getInstance() {

        if (instance == null) {

            instance = new Mesa();

        }

        return instance;

    }

    public void iniciar() {

        this.controle = new Controle();
        this.controle.addObservadores(this);

        initComponents();
        azuchiCarta.setEnabled(false);
        edoCarta.setEnabled(false);
        gassantodaCarta.setEnabled(false);
        gifuCarta.setEnabled(false);
        inuyamaCarta.setEnabled(false);
        kasugayamaCarta.setEnabled(false);
        kitanoshoCarta.setEnabled(false);
        kiyosuCarta.setEnabled(false);
        kumamotoCarta.setEnabled(false);
        marugameCarta.setEnabled(false);
        matsumotoCarta.setEnabled(false);
        matsuyamaCarta.setEnabled(false);
        odaniCarta.setEnabled(false);
        takahashiCarta.setEnabled(false);
        botaoFinalizarPartida.setEnabled(false);
        jpanelDados.setVisible(false);
        botaoRolar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelJogador1 = new javax.swing.JLabel();
        botaoIniciar = new javax.swing.JButton();
        botaoFinalizarPartida = new javax.swing.JButton();
        labelJogador2 = new javax.swing.JLabel();
        pontosJogador1 = new javax.swing.JLabel();
        pontosJogador2 = new javax.swing.JLabel();
        jpanelCartas = new javax.swing.JPanel();
        azuchiCarta = new javax.swing.JButton();
        edoCarta = new javax.swing.JButton();
        gassantodaCarta = new javax.swing.JButton();
        gifuCarta = new javax.swing.JButton();
        inuyamaCarta = new javax.swing.JButton();
        kasugayamaCarta = new javax.swing.JButton();
        kitanoshoCarta = new javax.swing.JButton();
        kiyosuCarta = new javax.swing.JButton();
        kumamotoCarta = new javax.swing.JButton();
        marugameCarta = new javax.swing.JButton();
        matsumotoCarta = new javax.swing.JButton();
        matsuyamaCarta = new javax.swing.JButton();
        odaniCarta = new javax.swing.JButton();
        takahashiCarta = new javax.swing.JButton();
        jpanelDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoRolar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Age of War ");
        setBackground(java.awt.Color.black);
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        labelJogador1.setText("Jogador 01");
        getContentPane().add(labelJogador1);
        labelJogador1.setBounds(180, 110, 160, 20);

        botaoIniciar.setText("Iniciar jogo");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoIniciar);
        botaoIniciar.setBounds(530, 10, 150, 32);

        botaoFinalizarPartida.setText("Finalizar");
        getContentPane().add(botaoFinalizarPartida);
        botaoFinalizarPartida.setBounds(530, 50, 150, 32);

        labelJogador2.setText("Jogador 2");
        getContentPane().add(labelJogador2);
        labelJogador2.setBounds(900, 100, 160, 20);

        pontosJogador1.setText("Pontuação");
        getContentPane().add(pontosJogador1);
        pontosJogador1.setBounds(180, 140, 180, 20);

        pontosJogador2.setText("Pontuação");
        getContentPane().add(pontosJogador2);
        pontosJogador2.setBounds(900, 130, 160, 20);

        jpanelCartas.setLayout(new java.awt.GridLayout(3, 5));

        azuchiCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/azuchi.png"))); // NOI18N
        azuchiCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azuchiCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(azuchiCarta);

        edoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/edo.png"))); // NOI18N
        edoCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edoCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(edoCarta);

        gassantodaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/gassantoda.png"))); // NOI18N
        gassantodaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gassantodaCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(gassantodaCarta);

        gifuCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/gifu.png"))); // NOI18N
        gifuCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gifuCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(gifuCarta);

        inuyamaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/inuyama.png"))); // NOI18N
        jpanelCartas.add(inuyamaCarta);

        kasugayamaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kasugayama.png"))); // NOI18N
        kasugayamaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kasugayamaCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(kasugayamaCarta);

        kitanoshoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kitanosho.png"))); // NOI18N
        kitanoshoCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitanoshoCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(kitanoshoCarta);

        kiyosuCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kiyosu.png"))); // NOI18N
        kiyosuCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiyosuCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(kiyosuCarta);

        kumamotoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kumamoto.png"))); // NOI18N
        kumamotoCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kumamotoCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(kumamotoCarta);

        marugameCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/marugame.png"))); // NOI18N
        marugameCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marugameCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(marugameCarta);

        matsumotoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/matsumoto.png"))); // NOI18N
        matsumotoCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matsumotoCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(matsumotoCarta);

        matsuyamaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/matsuyama.png"))); // NOI18N
        matsuyamaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matsuyamaCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(matsuyamaCarta);

        odaniCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/odani.png"))); // NOI18N
        odaniCarta.setToolTipText("");
        odaniCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odaniCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(odaniCarta);

        takahashiCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/takahashi.png"))); // NOI18N
        takahashiCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takahashiCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(takahashiCarta);

        getContentPane().add(jpanelCartas);
        jpanelCartas.setBounds(170, 180, 920, 460);

        jpanelDados.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/UmaEspada.png"))); // NOI18N
        jpanelDados.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/DuasEspada.png"))); // NOI18N
        jpanelDados.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/TresEspada.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jpanelDados.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/Arco.png"))); // NOI18N
        jpanelDados.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/Cavaleiro.png"))); // NOI18N
        jpanelDados.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/Daimio.png"))); // NOI18N
        jpanelDados.add(jLabel6);

        botaoRolar.setText("Rolar");
        botaoRolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRolarActionPerformed(evt);
            }
        });
        jpanelDados.add(botaoRolar);

        getContentPane().add(jpanelDados);
        jpanelDados.setBounds(170, 670, 930, 90);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed

        controle.iniciarJogo();


    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void gassantodaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gassantodaCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gassantodaCartaActionPerformed

    private void gifuCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gifuCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gifuCartaActionPerformed

    private void azuchiCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azuchiCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_azuchiCartaActionPerformed

    private void edoCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edoCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edoCartaActionPerformed

    private void botaoRolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarActionPerformed
        // TODO add your handling code here:


        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dados/2-espada.png")));
        
       controle.rolarDados(); 
        
        
        
        
        
    }//GEN-LAST:event_botaoRolarActionPerformed

    private void kitanoshoCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitanoshoCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitanoshoCartaActionPerformed

    private void kiyosuCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiyosuCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kiyosuCartaActionPerformed

    private void odaniCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odaniCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odaniCartaActionPerformed

    private void takahashiCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takahashiCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takahashiCartaActionPerformed

    private void kasugayamaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kasugayamaCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kasugayamaCartaActionPerformed
  
    private void kumamotoCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kumamotoCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kumamotoCartaActionPerformed

    private void marugameCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marugameCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marugameCartaActionPerformed

    private void matsumotoCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matsumotoCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matsumotoCartaActionPerformed

    private void matsuyamaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matsuyamaCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matsuyamaCartaActionPerformed

    public static void main(String args[]) {

        Mesa mesa = Mesa.getInstance();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton azuchiCarta;
    private javax.swing.JButton botaoFinalizarPartida;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton botaoRolar;
    private javax.swing.JButton edoCarta;
    private javax.swing.JButton gassantodaCarta;
    private javax.swing.JButton gifuCarta;
    private javax.swing.JButton inuyamaCarta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpanelCartas;
    private javax.swing.JPanel jpanelDados;
    private javax.swing.JButton kasugayamaCarta;
    private javax.swing.JButton kitanoshoCarta;
    private javax.swing.JButton kiyosuCarta;
    private javax.swing.JButton kumamotoCarta;
    private javax.swing.JLabel labelJogador1;
    private javax.swing.JLabel labelJogador2;
    private javax.swing.JButton marugameCarta;
    private javax.swing.JButton matsumotoCarta;
    private javax.swing.JButton matsuyamaCarta;
    private javax.swing.JButton odaniCarta;
    private javax.swing.JLabel pontosJogador1;
    private javax.swing.JLabel pontosJogador2;
    private javax.swing.JButton takahashiCarta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificarTelaIniciarJogo(String jogador1, String jogador2, int pontosPlayer1, int pontosPlayer2) {

        labelJogador1.setText(jogador1);
        labelJogador2.setText(jogador2);
        pontosJogador1.setText(pontosPlayer1 + "");
        pontosJogador2.setText(pontosPlayer2 + "");

        azuchiCarta.setEnabled(true);
        edoCarta.setEnabled(true);
        gassantodaCarta.setEnabled(true);
        gifuCarta.setEnabled(true);
        inuyamaCarta.setEnabled(true);
        kasugayamaCarta.setEnabled(true);
        kitanoshoCarta.setEnabled(true);
        kiyosuCarta.setEnabled(true);
        kumamotoCarta.setEnabled(true);
        marugameCarta.setEnabled(true);
        matsumotoCarta.setEnabled(true);
        matsuyamaCarta.setEnabled(true);
        odaniCarta.setEnabled(true);
        pontosJogador1.setEnabled(true);
        takahashiCarta.setEnabled(true);
        botaoIniciar.setEnabled(false);
        botaoFinalizarPartida.setEnabled(true);
        jpanelDados.setVisible(true);
        botaoRolar.setVisible(true);

    }

}

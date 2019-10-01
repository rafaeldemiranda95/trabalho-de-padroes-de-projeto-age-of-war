/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controle;
import controller.Observador;


/**
 *
 * @author rafae
 */
public class Mesa extends javax.swing.JFrame implements Observador {

    Controle controle;

    private Mesa() {

        iniciar();
        

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

        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelJogador1 = new javax.swing.JLabel();
        botaoIniciar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Age of War ");
        setBackground(java.awt.Color.black);

        labelJogador1.setText("Jogador 01");

        botaoIniciar.setText("Iniciar jogo");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        labelJogador2.setText("Jogador 2");

        pontosJogador1.setText("Pontuação");

        pontosJogador2.setText("Pontuação");

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
        jpanelCartas.add(kasugayamaCarta);

        kitanoshoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kitanosho.png"))); // NOI18N
        jpanelCartas.add(kitanoshoCarta);

        kiyosuCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kiyosu.png"))); // NOI18N
        jpanelCartas.add(kiyosuCarta);

        kumamotoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/kumamoto.png"))); // NOI18N
        jpanelCartas.add(kumamotoCarta);

        marugameCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/marugame.png"))); // NOI18N
        jpanelCartas.add(marugameCarta);

        matsumotoCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/matsumoto.png"))); // NOI18N
        jpanelCartas.add(matsumotoCarta);

        matsuyamaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/matsuyama.png"))); // NOI18N
        jpanelCartas.add(matsuyamaCarta);

        odaniCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/odani.png"))); // NOI18N
        odaniCarta.setToolTipText("");
        jpanelCartas.add(odaniCarta);

        takahashiCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas/takahashi.png"))); // NOI18N
        jpanelCartas.add(takahashiCarta);

        jpanelDados.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJogador1)
                    .addComponent(pontosJogador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(botaoIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(974, 974, 974)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJogador2)
                            .addComponent(pontosJogador2))))
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoIniciar)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJogador1)
                    .addComponent(labelJogador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pontosJogador1)
                    .addComponent(pontosJogador2))
                .addGap(86, 86, 86)
                .addComponent(jpanelCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(jpanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton edoCarta;
    private javax.swing.JButton gassantodaCarta;
    private javax.swing.JButton gifuCarta;
    private javax.swing.JButton inuyamaCarta;
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
    public void notificarTelaIniciarJogo(String jogador1, String jogador2) {

        

        labelJogador1.setText(jogador1);
        labelJogador2.setText(jogador2);

        
        
        
        
        
        
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
        botaoIniciar.setVisible(false);

        

    }




}

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
        azuchiCarta1.setVisible(false);
        edoCarta1.setVisible(false);
        gassantodaCarta1.setVisible(false);
        gifuCarta1.setVisible(false);
        inuyamaCarta1.setVisible(false);
        kasugayamaCarta1.setVisible(false);
        kitanoshoCarta1.setVisible(false);
        kiyosuCarta1.setVisible(false);
        kumamotoCarta1.setVisible(false);
        marugameCarta1.setVisible(false);
        matsumotoCarta1.setVisible(false);
        matsuyamaCarta1.setVisible(false);
        odaniCarta1.setVisible(false);
        takahashiCarta1.setVisible(false);

  
        
        
        
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
        jButton1 = new javax.swing.JButton();
        jpanelCartasJogador1 = new javax.swing.JPanel();
        takahashiCarta1 = new javax.swing.JButton();
        odaniCarta1 = new javax.swing.JButton();
        matsuyamaCarta1 = new javax.swing.JButton();
        matsumotoCarta1 = new javax.swing.JButton();
        kasugayamaCarta1 = new javax.swing.JButton();
        azuchiCarta1 = new javax.swing.JButton();
        edoCarta1 = new javax.swing.JButton();
        gassantodaCarta1 = new javax.swing.JButton();
        gifuCarta1 = new javax.swing.JButton();
        inuyamaCarta1 = new javax.swing.JButton();
        marugameCarta1 = new javax.swing.JButton();
        kumamotoCarta1 = new javax.swing.JButton();
        kiyosuCarta1 = new javax.swing.JButton();
        kitanoshoCarta1 = new javax.swing.JButton();
        jlabelCartasJogador01 = new javax.swing.JLabel();

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

        azuchiCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\azuchi.png")); // NOI18N
        jpanelCartas.add(azuchiCarta);

        edoCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\edo.png")); // NOI18N
        jpanelCartas.add(edoCarta);

        gassantodaCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\gassantoda.png")); // NOI18N
        gassantodaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gassantodaCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(gassantodaCarta);

        gifuCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\gifu.png")); // NOI18N
        gifuCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gifuCartaActionPerformed(evt);
            }
        });
        jpanelCartas.add(gifuCarta);

        inuyamaCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\inuyama.png")); // NOI18N
        jpanelCartas.add(inuyamaCarta);

        kasugayamaCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kasugayama.png")); // NOI18N
        jpanelCartas.add(kasugayamaCarta);

        kitanoshoCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kitanosho.png")); // NOI18N
        jpanelCartas.add(kitanoshoCarta);

        kiyosuCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kiyosu.png")); // NOI18N
        jpanelCartas.add(kiyosuCarta);

        kumamotoCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kumamoto.png")); // NOI18N
        jpanelCartas.add(kumamotoCarta);

        marugameCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\marugame.png")); // NOI18N
        jpanelCartas.add(marugameCarta);

        matsumotoCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\matsumoto.png")); // NOI18N
        jpanelCartas.add(matsumotoCarta);

        matsuyamaCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\matsuyama.png")); // NOI18N
        jpanelCartas.add(matsuyamaCarta);

        odaniCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\odani.png")); // NOI18N
        odaniCarta.setToolTipText("");
        jpanelCartas.add(odaniCarta);

        takahashiCarta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\takahashi.png")); // NOI18N
        jpanelCartas.add(takahashiCarta);

        jpanelDados.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("jButton1");
        jpanelDados.add(jButton1);

        jpanelCartasJogador1.setLayout(new java.awt.GridLayout(3, 5));

        takahashiCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\takahashi.png")); // NOI18N
        takahashiCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takahashiCarta1ActionPerformed(evt);
            }
        });
        jpanelCartasJogador1.add(takahashiCarta1);

        odaniCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\odani.png")); // NOI18N
        odaniCarta1.setToolTipText("");
        jpanelCartasJogador1.add(odaniCarta1);

        matsuyamaCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\matsuyama.png")); // NOI18N
        jpanelCartasJogador1.add(matsuyamaCarta1);

        matsumotoCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\matsumoto.png")); // NOI18N
        jpanelCartasJogador1.add(matsumotoCarta1);

        kasugayamaCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kasugayama.png")); // NOI18N
        jpanelCartasJogador1.add(kasugayamaCarta1);

        azuchiCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\azuchi.png")); // NOI18N
        jpanelCartasJogador1.add(azuchiCarta1);

        edoCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\edo.png")); // NOI18N
        jpanelCartasJogador1.add(edoCarta1);

        gassantodaCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\gassantoda.png")); // NOI18N
        gassantodaCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gassantodaCarta1ActionPerformed(evt);
            }
        });
        jpanelCartasJogador1.add(gassantodaCarta1);

        gifuCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\gifu.png")); // NOI18N
        gifuCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gifuCarta1ActionPerformed(evt);
            }
        });
        jpanelCartasJogador1.add(gifuCarta1);

        inuyamaCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\inuyama.png")); // NOI18N
        jpanelCartasJogador1.add(inuyamaCarta1);

        marugameCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\marugame.png")); // NOI18N
        jpanelCartasJogador1.add(marugameCarta1);

        kumamotoCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kumamoto.png")); // NOI18N
        jpanelCartasJogador1.add(kumamotoCarta1);

        kiyosuCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kiyosu.png")); // NOI18N
        jpanelCartasJogador1.add(kiyosuCarta1);

        kitanoshoCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\trabalho-de-padroes-de-projeto-age-of-war\\age-of-war\\img\\cartas\\kitanosho.png")); // NOI18N
        jpanelCartasJogador1.add(kitanoshoCarta1);

        jlabelCartasJogador01.setText("Cartas do Jogador 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJogador1)
                    .addComponent(pontosJogador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(botaoIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(912, 912, 912))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpanelCartasJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpanelCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabelCartasJogador01))
                                .addGap(18, 18, 18)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pontosJogador1)
                        .addComponent(pontosJogador2))
                    .addComponent(jpanelCartas, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jlabelCartasJogador01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelCartasJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366)
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

    private void gassantodaCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gassantodaCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gassantodaCarta1ActionPerformed

    private void gifuCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gifuCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gifuCarta1ActionPerformed

    private void takahashiCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takahashiCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_takahashiCarta1ActionPerformed

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
    private javax.swing.JButton azuchiCarta1;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton edoCarta;
    private javax.swing.JButton edoCarta1;
    private javax.swing.JButton gassantodaCarta;
    private javax.swing.JButton gassantodaCarta1;
    private javax.swing.JButton gifuCarta;
    private javax.swing.JButton gifuCarta1;
    private javax.swing.JButton inuyamaCarta;
    private javax.swing.JButton inuyamaCarta1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlabelCartasJogador01;
    private javax.swing.JPanel jpanelCartas;
    private javax.swing.JPanel jpanelCartasJogador1;
    private javax.swing.JPanel jpanelDados;
    private javax.swing.JButton kasugayamaCarta;
    private javax.swing.JButton kasugayamaCarta1;
    private javax.swing.JButton kitanoshoCarta;
    private javax.swing.JButton kitanoshoCarta1;
    private javax.swing.JButton kiyosuCarta;
    private javax.swing.JButton kiyosuCarta1;
    private javax.swing.JButton kumamotoCarta;
    private javax.swing.JButton kumamotoCarta1;
    private javax.swing.JLabel labelJogador1;
    private javax.swing.JLabel labelJogador2;
    private javax.swing.JButton marugameCarta;
    private javax.swing.JButton marugameCarta1;
    private javax.swing.JButton matsumotoCarta;
    private javax.swing.JButton matsumotoCarta1;
    private javax.swing.JButton matsuyamaCarta;
    private javax.swing.JButton matsuyamaCarta1;
    private javax.swing.JButton odaniCarta;
    private javax.swing.JButton odaniCarta1;
    private javax.swing.JLabel pontosJogador1;
    private javax.swing.JLabel pontosJogador2;
    private javax.swing.JButton takahashiCarta;
    private javax.swing.JButton takahashiCarta1;
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

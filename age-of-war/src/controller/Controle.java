/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Controle {

    private List<Observador> observadores = new ArrayList<>();

    public void addObservadores(Observador obs) {

        observadores.add(obs);

    }

    public void removerObservadores(Observador obs) {

        observadores.remove(obs);

    }

    public void iniciarJogo() {

        String jogador1 = JOptionPane.showInputDialog(null, "Nome do Jogador 1");
        String jogador2 = JOptionPane.showInputDialog(null, "Nome do Jogador 2");

        notificarIniciarJogo(jogador1, jogador2);

    }

    private void notificarIniciarJogo(String jogador1, String jogador2) {
        
        for (Observador observadore : observadores) {
            observadore.notificarTelaIniciarJogo(jogador1,jogador2);
        }
        
    }

}

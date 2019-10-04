/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Dado;
import model.Jogador;

/**
 *
 * @author rafae
 */
public class Controle {

    private List<Observador> observadores = new ArrayList<>();
    private List<ObservadorPopUp> observadoresPopUp = new ArrayList<>();

    public void addObservadores(Observador obs) {

        observadores.add(obs);

    }

    public void removerObservadores(Observador obs) {

        observadores.remove(obs);

    }

    public void iniciarJogo() {

        String jogador1 = JOptionPane.showInputDialog(null, "Nome do Jogador 1");
        String jogador2 = JOptionPane.showInputDialog(null, "Nome do Jogador 2");
     
        
        Jogador player1 = new Jogador();
        Jogador player2 = new Jogador();
        
        player1.setVezJogada(true);
        player1.setVezJogada(false);
        
        player1.setNome(jogador1);
        player2.setNome(jogador2); 
        
        int pontosPlayer1 = 0;
        int pontosPlayer2 = 0;
        
        player1.setPontos(pontosPlayer1);
        player2.setPontos(pontosPlayer2);
        
        System.out.println(player1.getPontos());
        
        
        
        
        notificarIniciarJogo(jogador1, jogador2, pontosPlayer1, pontosPlayer2);

    }

    private void notificarIniciarJogo(String jogador1, String jogador2, int pontosPlayer1, int pontosPlayer2) {
        
        for (Observador observadore : observadores) {
            observadore.notificarTelaIniciarJogo(jogador1,jogador2, pontosPlayer1, pontosPlayer2);
        }
        
    }

    public void rolarDados() {
       
        Random rolagemDado = new Random();
        
        List<Dado> dados = new ArrayList<Dado>();  
        dados.add(new Dado());
        
        Dado daimioDado = new Dado();
        
        Dado umEspadadaDado = new Dado();
        Dado doisEspadaDado = new Dado();
        Dado tresEspadaDado = new Dado();
        Dado cavaleiroDado = new Dado();
        Dado arcoDado = new Dado();
        
        
        dados.add(daimioDado);
        dados.add(umEspadadaDado);
        dados.add(doisEspadaDado);
        dados.add(tresEspadaDado);
        dados.add(cavaleiroDado);
        dados.add(arcoDado);
        
        
        
        daimioDado.setCaminhoImg("/img/dados/dado(1).png");
        umEspadadaDado.setCaminhoImg("/img/dados/dado(2).png");
        doisEspadaDado.setCaminhoImg("/img/dados/dado(3).png");
        tresEspadaDado.setCaminhoImg("/img/dados/dado(4).png");
        arcoDado.setCaminhoImg("/img/dados/dado(5).png");
        cavaleiroDado.setCaminhoImg("/img/dados/dado(6).png");
        
        
        
        
        
        
        
        
    }

}

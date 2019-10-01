/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Jogador;

/**
 *
 * @author rafae
 */
public interface Observador {
//
//    public void notificarTelaIniciarJogo(String jogador1, String jogador2);

    public void notificarTelaIniciarJogo(String jogador1, String jogador2, int pontosPlayer1, int pontosPlayer2);



}

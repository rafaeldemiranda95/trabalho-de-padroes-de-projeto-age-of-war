/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class Jogador {
    private String nome;
    private int pontos = 0;
    private boolean vezJogada;

    public Jogador(String nome, boolean vezJogada) {
        this.nome = nome;
        this.vezJogada = vezJogada;
    }

    public Jogador() {
    }

  
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isVezJogada() {
        return vezJogada;
    }

    public void setVezJogada(boolean vezJogada) {
        this.vezJogada = vezJogada;
    }
    
}

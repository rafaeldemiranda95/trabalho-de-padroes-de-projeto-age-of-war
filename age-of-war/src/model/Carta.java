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
public class Carta {
    private String linhaEspecialBatalha;
    private int linhasBatalha;
    private int pontosCastelo;
    private String nomeCastelo;
    private String nomeCla;
    private String iconeCla;
    private int numeroCartasCla;
    private int pontosCla;

    public Carta(String linhaEspecialBatalha, int linhasBatalha, int pontosCastelo, String nomeCastelo, String nomeCla, String iconeCla, int numeroCartasCla, int pontosCla) {
        this.linhaEspecialBatalha = linhaEspecialBatalha;
        this.linhasBatalha = linhasBatalha;
        this.pontosCastelo = pontosCastelo;
        this.nomeCastelo = nomeCastelo;
        this.nomeCla = nomeCla;
        this.iconeCla = iconeCla;
        this.numeroCartasCla = numeroCartasCla;
        this.pontosCla = pontosCla;
    }

    public String getLinhaEspecialBatalha() {
        return linhaEspecialBatalha;
    }

    public void setLinhaEspecialBatalha(String linhaEspecialBatalha) {
        this.linhaEspecialBatalha = linhaEspecialBatalha;
    }

    public int getLinhasBatalha() {
        return linhasBatalha;
    }

    public void setLinhasBatalha(int linhasBatalha) {
        this.linhasBatalha = linhasBatalha;
    }

    public int getPontosCastelo() {
        return pontosCastelo;
    }

    public void setPontosCastelo(int pontosCastelo) {
        this.pontosCastelo = pontosCastelo;
    }

    public String getNomeCastelo() {
        return nomeCastelo;
    }

    public void setNomeCastelo(String nomeCastelo) {
        this.nomeCastelo = nomeCastelo;
    }

    public String getNomeCla() {
        return nomeCla;
    }

    public void setNomeCla(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public String getIconeCla() {
        return iconeCla;
    }

    public void setIconeCla(String iconeCla) {
        this.iconeCla = iconeCla;
    }

    public int getNumeroCartasCla() {
        return numeroCartasCla;
    }

    public void setNumeroCartasCla(int numeroCartasCla) {
        this.numeroCartasCla = numeroCartasCla;
    }

    public int getPontosCla() {
        return pontosCla;
    }

    public void setPontosCla(int pontosCla) {
        this.pontosCla = pontosCla;
    }
    
    
    
    
    
}

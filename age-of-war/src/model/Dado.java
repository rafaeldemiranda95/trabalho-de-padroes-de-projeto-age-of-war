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
public class Dado {
  
    
//    String [] posicaoDado = new String [6];
  
    
    private String caminhoImg;
    private String nome;

    public Dado(String caminhoImg, String nome) {
        this.caminhoImg = caminhoImg;
        this.nome = nome;
    }

    public Dado() {
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    
}

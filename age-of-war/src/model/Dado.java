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

    private static String[] posicaoDado = new String[]{"Daimio", "UmaEspada", "DuasEspada", "TresEspada", "Arco", "Cavaleiro"};

    private int lado;
    private String caminhoImg;

    public Dado() {
    }

    public static String[] getPosicaoDado() {
        return posicaoDado;
    }

    public static void setPosicaoDado(String[] posicaoDado) {
        Dado.posicaoDado = posicaoDado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }

}
